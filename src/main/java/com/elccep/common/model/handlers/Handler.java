package com.elccep.common.model.handlers;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.elccep.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author blue7
 * @date 2020/8/5 15:13
 **/
@Component
public class Handler<T> {


    /**
     * 这里是传入类的全限定名，json字符串和获取属性yml文件中指定key的value的对象，返回一个大的的Java对象
     * @param classFullName 类的全限定名
     * @param jsonStr   与该类对应的json字符串
     * @param environment 环境对象
     * @return
     */
    public   T handle(String classFullName,  String jsonStr,Environment environment){
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        return handle(classFullName,jsonObject,environment);
    }


    public  T handle(String classFullName, JSONObject jsonObj,Environment environment){
        return (T)this.handleObjOrArray(classFullName,jsonObj,environment);
    }

    /**
     * 将类的全限定名的类名首字母小写
     * @param classFullName
     * @return
     */
    private String toLowerClassFullName(String classFullName) {
        String strPro=classFullName.substring(0,classFullName.lastIndexOf("."));
        String strLast=classFullName.substring(classFullName.lastIndexOf(".")+1);
        strLast= StringUtils.toLowerCaseFirstOne(strLast);
        return strPro+"."+strLast;
    }




    public  Object handleObjOrArray(String classFullName, JSONObject jsonObj,Environment environment){

//        1.首先是截取类的全限定名，截取的字符串是com.elccep.common.enity.Javaobj
//      类名，不是限定名，是JavaObj
        String className=classFullName.substring(classFullName.lastIndexOf(".")+1);
//       小写，JavaObj
        className=StringUtils.toLowerCaseFirstOne(className);
//      获取包名
        String classFullNamePro=classFullName.substring(0,classFullName.lastIndexOf("."));
//        这几步是为了将类名全部小写，为该类的对象属性设置包名，即如果该类有对象属性，在获取其类的对象时通过类的全限定名（包名 + 对象属性名首字母大写）
        String classFullNameToLower=classFullNamePro+"."+className;


//      这是类的相对的包名，就是跟json字符串中对应key的路径相匹配
        String classRelativePackage="";
//        这一步主要是为了截取 类的全限定名前面的 项目的路径字符串（就是到environment.getProperty("classRootPackage")），主要是为了截取后在yml文件中匹配对象的value，因为json字符串的结构是不包括项目的路径的
//        还有就是这里也是为了判断是否是 Java对象，如果是，由于json就是一个大对象，所以在yml中是获取不到的路径，所以不需要截取 “ . ”
        if(classFullName.equalsIgnoreCase(environment.getProperty("classRootPackage"))){
//          classRelativePackage
            classRelativePackage=classFullNameToLower.replace(environment.getProperty("classRootPackage"),"");
        }else{
//            package
            classRelativePackage=classFullNameToLower.replace(environment.getProperty("classRootPackage")+".","");
        }


//        获取类实例
        Class clazz=null;
        try {
           clazz=Class.forName(classFullName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object obj=null;
        try {
            obj = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
//      获取所有的属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field:declaredFields){
            String key="";//获取yml中指定值的key
            if(!classRelativePackage.equalsIgnoreCase("")&&classRelativePackage!=null){
                key=classRelativePackage+"."+field.getName();
            }else{
                key=field.getName();
            }
//            获取json中指定对象的key
            String jsonKey=environment.getProperty(key);
//            通过key 获取value
            Object 	propertyObj = jsonObj.get(jsonKey);
            if(propertyObj instanceof JSONObject){
                String classFullNameNext=classFullNameToLower+"."+StringUtils.toUpperCaseFirstOne(field.getName());

                field.setAccessible(true);
                try {
//                    这里是将新建一个对象，并赋值给这个对象属性
                    field.set(obj,this.handleObjOrArray(classFullNameNext, (JSONObject) propertyObj,environment));//为属性赋值
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(propertyObj instanceof JSONArray){


                String classFullNameNext=classFullNameToLower+"."+StringUtils.toUpperCaseFirstOne(field.getName());

                field.setAccessible(true);
                try {
//                  这里是遍历数组，在跟json对象一样的操作
                    field.set(obj,this.parseJSONArray(classFullNameNext,(JSONArray)propertyObj,environment));//为属性赋值
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }else {//如果是基本属性，就直接赋值
                field.setAccessible(true);
                try {
                    field.set(obj,propertyObj);//为属性赋值
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
//            else if(propertyObj instanceof Integer){
////System.out.println(Integer.parseInt(a.toString()));
//                field.setAccessible(true);//取消断言
//                try {
//                    field.set(obj,propertyObj);//为属性赋值
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            else if(propertyObj  instanceof String){
////                System.out.println(a);
//                field.setAccessible(true);//取消断言
//                try {
//                    field.set(obj,propertyObj);//为属性赋值
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            else if(propertyObj  instanceof Boolean){
////                System.out.println(propertyObj);
//                field.setAccessible(true);//取消断言
//                try {
//                    field.set(obj,propertyObj);//为属性赋值
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }


        }

        return (T) obj;
    }

    /**
     * 解析jsonarray
     * @param classFullName
     * @param jsonArray
     * @param environment
     * @return
     */
    private Object parseJSONArray(String classFullName, JSONArray jsonArray,Environment environment) {
        List<Object> objs=new ArrayList<>();
        for(Object obj:jsonArray){
            if(obj instanceof JSONObject){
                objs.add(this.handleObjOrArray(classFullName, (JSONObject) obj,environment));
            }else  if (obj instanceof JSONArray){
                this.parseJSONArray(classFullName,(JSONArray)obj,environment);
//                throw new RuntimeException("不是吧，数组里面套着数组，不带这么坑人的吧，抱歉暂时还处理不了数组中套着数组的情况，");
            }else {
                objs.add(obj);
            }
        }
        return objs;
    }
}

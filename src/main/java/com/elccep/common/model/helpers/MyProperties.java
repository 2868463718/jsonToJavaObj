package com.elccep.common.model.helpers;

import com.elccep.common.model.interfaces.IMyProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Properties;

/**
 * @author blue7
 * @date 2020/8/5 14:57
 **/
@Component
@Data
@AllArgsConstructor
public class MyProperties implements IMyProperties {
//    Properties properties;
//    public MyProperties() {
//        this.initPropertiesFromDefaultFile();
//    }
//
//    public MyProperties(String filePath){
//        File file=new File(filePath);
//        this.initPropertiesFromFile(file);
//    }
//    public MyProperties(InputStream in ){
//        this.initPropertiesFromInputStream(in);
//    }
//
//    private void initPropertiesFromFile(File file) {
//        InputStream in= null;
//        try {
//            in = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        this.initPropertiesFromInputStream(in);
//    }
//
//    private void initPropertiesFromDefaultFile() {
//        InputStream in= null;
//        try {
//            in = new FileInputStream(new File("src\\main\\resources\\ConsumerBestRecord_OperationConfig.properties"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        properties=new Properties();
//        try {
//            properties.load(in);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    private void initPropertiesFromInputStream(InputStream in) {
//        properties=new Properties();
//        try {
//            properties.load(in);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//

}

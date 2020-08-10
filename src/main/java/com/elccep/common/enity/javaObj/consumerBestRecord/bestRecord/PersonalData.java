package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord;

import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.personalData.LastUpdateTouchPointSourceSystem;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.personalData.RegPersonnelSourceSystem;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.personalData.RegTouchPointSourceSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 282
**/

public class PersonalData{
  private String writtenLanguageCode;
  private int birthDay;
  private String nameGenderCode;
  private LastUpdateTouchPointSourceSystem lastUpdateTouchPointSourceSystem;
  private String regDate;
  private boolean nameFilledFlag;
  private RegPersonnelSourceSystem regPersonnelSourceSystem;
  private int estimatedBirthYear;
  private int birthMonth;
  private String genderCode;
  private String civilStatusCode;
  private RegTouchPointSourceSystem regTouchPointSourceSystem;
  private int birthYear;
  private String consumerCountryCode_ISO3;
  private String spokenLanguageCode;
  private boolean eformRegFlag;
}
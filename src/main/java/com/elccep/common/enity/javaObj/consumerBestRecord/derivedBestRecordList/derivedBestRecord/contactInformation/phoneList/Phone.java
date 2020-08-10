package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.phoneList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 338
**/

public class Phone{
  private String regionalCode;
  private String extension;
  private String dataQualityCode;
  private String phoneNumber;
  private String phoneCountryCode;
  private String registrar;
  private String dataQualityDescription;
  private String sourceTimestamp;
  private String regPhoneTypeCode;
  private String countryCode_ISO3;
  private String typeCode;
}
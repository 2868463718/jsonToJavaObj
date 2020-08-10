package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 284
**/

public class Attributes{
  private String recognitionServiceCode;
  private String cSRInstanceCode;
  private String sourceTimestamp;
  private String universalKey;
  private String cSRInstanceDescription;
  private String recordTimestamp;
}
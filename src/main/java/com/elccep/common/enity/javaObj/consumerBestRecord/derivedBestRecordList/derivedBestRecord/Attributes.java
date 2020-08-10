package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 318
**/

public class Attributes{
  private String sourceTimestamp;
  private String marketCode;
  private String touchPointCode;
  private String retailerHierarchyCode;
  private String recordTimestamp;
  private String brandCode;
}
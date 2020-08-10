package com.elccep.common.enity.javaObj;

import com.elccep.common.enity.javaObj.consumerBestRecord.DerivedBestRecordList;
import com.elccep.common.enity.javaObj.consumerBestRecord.BestRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 407
**/

public class ConsumerBestRecord{
  private String recordUUID;
  private DerivedBestRecordList derivedBestRecordList;
  private BestRecord bestRecord;
}
package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.optInList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 348
**/

public class OptIn{
  private String optInTimestamp;
  private boolean optInFlag;
  private String optInSourceSystemCode;
  private String communicationChannelCode;
}
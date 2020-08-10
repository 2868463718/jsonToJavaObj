package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.noteList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 314
**/

public class Note{
  private String note;
  private String updateDate;
  private String createBy;
  private String updateBy;
  private String seqNum;
  private String location;
  private String type;
  private String createDate;
}
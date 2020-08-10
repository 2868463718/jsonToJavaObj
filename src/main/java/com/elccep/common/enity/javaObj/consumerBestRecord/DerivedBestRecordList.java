package com.elccep.common.enity.javaObj.consumerBestRecord;

import java.util.List;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.DerivedBestRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 405
**/

public class DerivedBestRecordList{
  private List<DerivedBestRecord> derivedBestRecord;
}
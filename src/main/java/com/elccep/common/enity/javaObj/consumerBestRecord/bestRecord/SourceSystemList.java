package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord;

import java.util.List;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.sourceSystemList.SourceSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 288
**/

public class SourceSystemList{
  private List<SourceSystem> sourceSystem;
}
package com.elccep.common.enity.javaObj.consumerBestRecord;

import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.SourceSystemList;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.ProgramList;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.Attributes;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.PersonalData;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.CustomAttributeList;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.CalculatedBusinessVariables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 307
**/

public class BestRecord{
  private SourceSystemList sourceSystemList;
  private PersonalData personalData;
  private ProgramList programList;
  private Attributes attributes;
  private CustomAttributeList customAttributeList;
  private CalculatedBusinessVariables calculatedBusinessVariables;
}
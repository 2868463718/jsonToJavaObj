package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord;

import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.RecencySegment;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.PurchaseSummary;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.ValueGroup;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.Segment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 305
**/

public class CalculatedBusinessVariables{
  private int decile;
  private PurchaseSummary purchaseSummary;
  private Segment segment;
  private RecencySegment recencySegment;
  private ValueGroup valueGroup;
}
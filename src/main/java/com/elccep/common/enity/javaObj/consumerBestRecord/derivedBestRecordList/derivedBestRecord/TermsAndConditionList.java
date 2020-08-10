package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord;

import java.util.List;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.termsAndConditionList.TermsAndCondition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 398
**/

public class TermsAndConditionList{
  private List<TermsAndCondition> termsAndCondition;
}
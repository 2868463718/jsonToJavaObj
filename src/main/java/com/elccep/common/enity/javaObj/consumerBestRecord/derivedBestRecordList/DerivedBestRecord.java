package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList;

import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.SourceSystemList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.OptInList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.ContactInformation;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.NoteList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.Attributes;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.CrossBrandOptInList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.AuxiliaryAttributeList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.TermsAndConditionList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.CustomAttributeList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.CustomerGroupList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.PersonalData;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.RemarkList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 403
**/

public class DerivedBestRecord{
  private AuxiliaryAttributeList auxiliaryAttributeList;
  private String level;
  private SourceSystemList sourceSystemList;
  private PersonalData personalData;
  private CustomerGroupList customerGroupList;
  private NoteList noteList;
  private CustomAttributeList customAttributeList;
  private OptInList optInList;
  private CrossBrandOptInList crossBrandOptInList;
  private ContactInformation contactInformation;
  private Attributes attributes;
  private TermsAndConditionList termsAndConditionList;
  private RemarkList remarkList;
}
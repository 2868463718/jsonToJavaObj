package com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord;

import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.AddressList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.EMediaList;
import com.elccep.common.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.PhoneList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 346
**/

public class ContactInformation{
  private EMediaList eMediaList;
  private AddressList addressList;
  private PhoneList phoneList;
}
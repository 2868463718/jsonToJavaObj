package com.elccep.common.enity;

import com.elccep.common.enity.javaObj.Header;
import com.elccep.common.enity.javaObj.ConsumerBestRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 408
**/

public class JavaObj{
  private ConsumerBestRecord consumerBestRecord;
  private Header header;
}
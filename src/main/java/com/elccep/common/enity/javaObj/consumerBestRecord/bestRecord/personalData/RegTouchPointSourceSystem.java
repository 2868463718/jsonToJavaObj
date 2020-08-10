package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.personalData;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 278
**/

public class RegTouchPointSourceSystem{
  private String divisionCode;
  private String sourceTimestamp;
  private String marketCode;
  private String touchPointCode;
  private String affiliateCode;
  private String brandCode;
}
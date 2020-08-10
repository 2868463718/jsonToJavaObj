package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables;

import java.math.BigDecimal;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.purchaseSummary.Currency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 303
**/

public class PurchaseSummary{
  private BigDecimal grossRevenueVAT;
  private int totalPurchaseNumber;
  private BigDecimal netRevenueVAT;
  private int r12MPurchaseNumber;
  private Currency currency;
  private BigDecimal grossRevenueNoVAT;
  private BigDecimal netRevenueNoVAT;
}
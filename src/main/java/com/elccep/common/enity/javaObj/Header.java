package com.elccep.common.enity.javaObj;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 244
**/

public class Header{
  private String documentTimestamp;
  private String documentUUID;
  private String action;
}
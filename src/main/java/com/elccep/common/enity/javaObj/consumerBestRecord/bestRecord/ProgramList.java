package com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord;

import java.util.List;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.programList.Program;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 12: 01: 07: 265
**/

public class ProgramList{
  private List<Program> program;
}
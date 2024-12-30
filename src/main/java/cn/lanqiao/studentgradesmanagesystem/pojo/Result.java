package cn.lanqiao.studentgradesmanagesystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

  private long resId;
  private String stuId;
  private String subName;
  private long resNum;
  private String resTerm;

}
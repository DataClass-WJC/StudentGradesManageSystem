package cn.lanqiao.studentgradesmanagesystem.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

  private int resId;
  private String stuId;
  private String subName;
  private int resNum;
  private String resTerm;

}
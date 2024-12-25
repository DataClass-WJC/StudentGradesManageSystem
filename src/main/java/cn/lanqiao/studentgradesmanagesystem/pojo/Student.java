package cn.lanqiao.studentgradesmanagesystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  private String stuId;
  private String stuName;
  private String stuPass;
  private String stuClass;
  private long stuSex;
  private String stuTele;
  private String isDelete;

}

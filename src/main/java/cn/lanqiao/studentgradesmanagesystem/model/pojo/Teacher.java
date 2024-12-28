package cn.lanqiao.studentgradesmanagesystem.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

  private String teaId;
  private String teaName;
  private String teaPass;
  private String teaSex;
  private String teaTele;

}

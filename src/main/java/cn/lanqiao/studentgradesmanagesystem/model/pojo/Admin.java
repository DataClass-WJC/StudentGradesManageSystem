package cn.lanqiao.studentgradesmanagesystem.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

  private String adminId;
  private String adminName;
  private String adminPass;

}
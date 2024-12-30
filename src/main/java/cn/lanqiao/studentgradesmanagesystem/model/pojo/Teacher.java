package cn.lanqiao.studentgradesmanagesystem.model.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("teacher")
public class Teacher {

  private String teaId;
  private String teaName;
  private String teaPass;
  private String teaSex;
  private String teaTele;

}

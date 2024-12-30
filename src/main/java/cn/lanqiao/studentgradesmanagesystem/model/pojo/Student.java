package cn.lanqiao.studentgradesmanagesystem.model.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2024-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("student")
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "stu_id", type = IdType.AUTO)
    private Integer stuId;

    @TableField("stu_name")
    private String stuName;

    @TableField("stu_pass")
    private String stuPass;

    @TableField("stu_class")
    private String stuClass;

    @TableField("stu_sex")
    private Integer stuSex;

    @TableField("stu_tele")
    private String stuTele;

    @TableField("is_delete")
    private String isDelete;


}

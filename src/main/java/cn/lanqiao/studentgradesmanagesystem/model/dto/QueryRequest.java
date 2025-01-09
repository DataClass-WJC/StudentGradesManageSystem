package cn.lanqiao.studentgradesmanagesystem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

//分页查询
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryRequest {
    private Integer pageNum = 1; // 当前页
    private Integer pageSize = 4; // 一页显示4条
    private Integer res_id;
    private String stu_id;
    private String sub_name;
    private Integer res_num;
    private String res_term;
    private Integer total;
}

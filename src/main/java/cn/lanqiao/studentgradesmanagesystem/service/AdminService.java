package cn.lanqiao.studentgradesmanagesystem.service;


import cn.lanqiao.studentgradesmanagesystem.model.dto.QueryRequest;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    Admin loginAdm(Adminatp admin);

    //    分页查询
    List<QueryRequest> selectList(int size,int stu_id);
    //    查总数
    Integer selectTotal(int stu_id);
}

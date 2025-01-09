package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.TAdminMapper;

import cn.lanqiao.studentgradesmanagesystem.model.dto.QueryRequest;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import cn.lanqiao.studentgradesmanagesystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private TAdminMapper tAdminMapper;
    @Override
    public Admin loginAdm(Adminatp adminatp) {
        System.out.println("adminatp");
        Admin result = tAdminMapper.loginAdm(adminatp);
        System.out.println(result);
        if (result!=null){
            //登录成功,就将查询到的数据返回给controller
            return result;
        }else {
            //登录失败
            return null;
        }
    }
    @Override
    public List<QueryRequest> selectList(int size,int stu_id) {
        List<QueryRequest> results = tAdminMapper.selectList(size,stu_id);
        if (results != null) {
            return results;
        } else {
            return null;
        }
    }

    @Override
    public Integer selectTotal(int stu_id) {
        Integer result = tAdminMapper.selectTotal(stu_id);
        return result;
    }
}

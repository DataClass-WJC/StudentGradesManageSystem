package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.TAdminMapper;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import cn.lanqiao.studentgradesmanagesystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServicempl implements AdminService {
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
}

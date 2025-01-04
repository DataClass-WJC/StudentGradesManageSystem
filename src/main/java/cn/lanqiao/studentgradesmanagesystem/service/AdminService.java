package cn.lanqiao.studentgradesmanagesystem.service;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin loginAdm(Adminatp admin);
}

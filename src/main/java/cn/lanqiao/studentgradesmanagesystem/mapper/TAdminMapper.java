package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TAdminMapper {
    Admin loginAdm(Adminatp admin);
}

package cn.lanqiao.studentgradesmanagesystem.mapper;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper

public interface studentUpMapper {

    Student update(Object student);

    @Update("update student set stu_name=#{stuName} ,stu_pass=#{stuPass},stu_class=#{stuClass},stu_sex=#{stuSex},stu_tele=#{stuTele} where stu_name=#{stuName}")
    int updates(Student student);
}

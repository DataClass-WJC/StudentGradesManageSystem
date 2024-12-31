package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.pojo.Teacher;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;



@Service
public interface teacherMapper {
    /**
     * 登录
     */
    @Select("select * from teacher where teaName=#{teaName} and teaPass=#{teaPass}")
    Teacher login(Teacher teacher);

}

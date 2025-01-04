package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.model.dto.TeacherLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherloginMapper {
    Teacher login(TeacherLoginDTO loginDTO);
}

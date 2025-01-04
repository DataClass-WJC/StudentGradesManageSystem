package cn.lanqiao.studentgradesmanagesystem.mapper;

import cn.lanqiao.studentgradesmanagesystem.model.dto.StudentLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Student login(StudentLoginDTO loginDTO);
}

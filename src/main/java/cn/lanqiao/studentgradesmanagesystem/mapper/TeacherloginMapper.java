package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.model.dto.TeacherLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TeacherloginMapper {
    Teacher login(TeacherLoginDTO loginDTO);
    Teacher selectTea(Object teacher);

    @Update("update teacher set tea_name=#{teaName},tea_pass=#{teaPass},tea_tele=#{teaTele} where tea_id=#{teaId}")
    int selectTeas(Teacher teacher);
}

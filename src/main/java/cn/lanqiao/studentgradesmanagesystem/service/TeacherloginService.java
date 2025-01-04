package cn.lanqiao.studentgradesmanagesystem.service;


import cn.lanqiao.studentgradesmanagesystem.model.dto.TeacherLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;

public interface TeacherloginService {
        Teacher login(TeacherLoginDTO loginDTO);
}

package cn.lanqiao.studentgradesmanagesystem.service;


import cn.lanqiao.studentgradesmanagesystem.model.dto.StudentLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;

public interface StudentService {
    Student login(StudentLoginDTO loginDTO);
}

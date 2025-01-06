package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.StudentLoginMapper;
import cn.lanqiao.studentgradesmanagesystem.model.dto.StudentLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import cn.lanqiao.studentgradesmanagesystem.service.StudentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentLoginServiceImpl implements StudentLoginService {
    @Autowired
    private StudentLoginMapper studentMapper;

    @Override
    public Student login(StudentLoginDTO loginDTO) {
        return studentMapper.login(loginDTO);
    }
}

package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.TeacherloginMapper;

import cn.lanqiao.studentgradesmanagesystem.model.dto.TeacherLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.service.TeacherloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherloginServiceImpl implements TeacherloginService  {
    @Autowired
    private TeacherloginMapper teacherMapper;

    @Override
    public Teacher login(TeacherLoginDTO loginDTO) {
        return teacherMapper.login(loginDTO);
    }
}

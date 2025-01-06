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
    @Override
    public Teacher selectTea(Object teacher) {
        try {

            Teacher teacher1 = teacherMapper.selectTea(teacher);
            System.out.println(teacher1);
            if(teacher1==null){
                return null;
            }else {
                return teacher1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int selectTeas(Teacher teacher) {
        try {

            int updates = teacherMapper.selectTeas(teacher);
            if(updates<0){
                return 0;
            }else {
                return 1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

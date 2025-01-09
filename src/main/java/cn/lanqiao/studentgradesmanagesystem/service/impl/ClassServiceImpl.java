package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.ClassMapper;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Class;
import cn.lanqiao.studentgradesmanagesystem.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Class> getAllClasses() {
        return classMapper.getAllClasses();
    }

    @Override
    public List<Class> getClassByName(String className) {
        return classMapper.getClassByName(className);
    }

    @Override
    public Class getClassById(String classId) {
        return classMapper.getClassById(classId);
    }
    @Override
    public int addClass(Class classList) {
        return classMapper.addClass(classList);
    }

    @Override
    public int deleteClass(String classId) {
        return classMapper.deleteClass(classId);
    }
    @Override
    public int updateClass(Class classList) {
        return classMapper.updateClass(classList);
    }
}

package cn.lanqiao.studentgradesmanagesystem.service;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Class;
import java.util.List;

public interface ClassService {
    List<Class> getAllClasses();
    List<Class> getClassByName(String className);
    Class getClassById(String classId);
    int addClass(Class classList);
    int deleteClass(String classId);
    int updateClass(Class classList);
}

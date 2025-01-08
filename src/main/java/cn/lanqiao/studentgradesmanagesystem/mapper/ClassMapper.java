package cn.lanqiao.studentgradesmanagesystem.mapper;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Class;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ClassMapper {
    List<Class> getAllClasses();
    List<Class> getClassByName(String className);
    Class getClassById(String classId);
    int addClass(Class classlist);
    int deleteClass(String classId);
}

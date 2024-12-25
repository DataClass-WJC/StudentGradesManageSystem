package cn.lanqiao.studentgradesmanagesystem.service.serviceImpl;

import cn.lanqiao.studentgradesmanagesystem.mapper.teacherMapper;
import cn.lanqiao.studentgradesmanagesystem.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teacherServiceImpl implements teacherService {
    //依赖注入
    @Autowired
    private teacherMapper teacherMapper;
    @Override
    public Teacher login(Teacher teacher) {
        Teacher result = teacherMapper.login(teacher);
        if(result != null){
            //登录成功
            return result;
        }else {
            //登录失败
            return null;
        }
    }
}

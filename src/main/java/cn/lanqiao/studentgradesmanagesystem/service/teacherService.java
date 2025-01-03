package cn.lanqiao.studentgradesmanagesystem.service;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import org.springframework.stereotype.Service;



@Service
public interface teacherService {
    /**
     * 登录
     * @param teacher
     * @return
     */
    Teacher login(Teacher teacher);
}

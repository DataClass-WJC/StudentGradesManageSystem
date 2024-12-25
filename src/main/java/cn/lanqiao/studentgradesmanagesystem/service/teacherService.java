package cn.lanqiao.studentgradesmanagesystem.service;

import cn.lanqiao.studentgradesmanagesystem.pojo.Result;
import cn.lanqiao.studentgradesmanagesystem.pojo.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface teacherService {
    /**
     * 登录
     * @param teacher
     * @return
     */
    Teacher login(Teacher teacher);
}

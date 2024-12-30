package cn.lanqiao.studentgradesmanagesystem.service;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;



public interface teacherService extends IService<Teacher> {
    /**
     * 登录
     * @param teacher
     * @return
     */
    Teacher login(Teacher teacher);


    /***
     * 删除
     * @param teaId
     */
    void deleteById(Integer teaId);
}

package cn.lanqiao.studentgradesmanagesystem.service.impl;


import cn.lanqiao.studentgradesmanagesystem.mapper.teacherMapper;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.service.teacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class teacherServiceImpl extends ServiceImpl<teacherMapper,Teacher>  implements teacherService {
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


    /***
     * 删除
     * @param teaId
     */
    @Override
    public void deleteById(Integer teaId) {
        teacherMapper.delete(teaId);
    }
}

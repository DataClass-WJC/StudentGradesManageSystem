package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import cn.lanqiao.studentgradesmanagesystem.mapper.StudentMapper;
import cn.lanqiao.studentgradesmanagesystem.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2024-12-29
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}

package cn.lanqiao.studentgradesmanagesystem.service.impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.studentUpMapper;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import cn.lanqiao.studentgradesmanagesystem.service.studentUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentUpServiceImpl implements studentUpService {
    @Autowired
    private studentUpMapper students;

    @Override
    public Student update(Object student) {
        try {
            Student update = students.update(student);
            if(update==null){
                return null;
            }else {
                return update;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updates(Student student) {
        try {

            int updates = students.updates(student);
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

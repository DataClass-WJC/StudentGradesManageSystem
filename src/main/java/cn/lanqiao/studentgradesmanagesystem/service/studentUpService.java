package cn.lanqiao.studentgradesmanagesystem.service;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;

public interface studentUpService {
    Student update(Object student);

    int updates(Student student);
}

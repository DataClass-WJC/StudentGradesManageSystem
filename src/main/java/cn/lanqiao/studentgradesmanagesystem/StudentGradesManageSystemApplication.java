package cn.lanqiao.studentgradesmanagesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lanqiao.studentgradesmanagesystem.mapper")
public class StudentGradesManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentGradesManageSystemApplication.class, args);
    }

}

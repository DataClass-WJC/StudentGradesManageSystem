package cn.lanqiao.studentgradesmanagesystem.controller;


import cn.lanqiao.studentgradesmanagesystem.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.service.teacherService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Teacher")
public class teacherController {
    @Autowired
    private teacherService teacherService;
    /**
     *
     */
    @RequestMapping("/login")
    public ResponseUtils login(@RequestBody Teacher teacher, HttpServletResponse response, HttpServletRequest request){
        teacherService.login(teacher);
        return null;
    }

}

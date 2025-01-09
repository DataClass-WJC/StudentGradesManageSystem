package cn.lanqiao.studentgradesmanagesystem.controller;

import cn.lanqiao.studentgradesmanagesystem.model.dto.StudentLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import cn.lanqiao.studentgradesmanagesystem.service.StudentLoginService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Student")
@CrossOrigin
public class StudentLoginController {
    @Autowired
    private StudentLoginService studentService;

    @PostMapping("/login")
    public ResponseUtils login(@RequestBody StudentLoginDTO loginDTO, HttpServletRequest request) {
        try {
            Student student = studentService.login(loginDTO);
            if (student == null) {
                return new ResponseUtils<>(500, "登录失败");
            }
            HttpSession session = request.getSession();
            session.setAttribute("studentLogin",student.getStuId());
            return new ResponseUtils<>(200, "登录成功", student);
        } catch (Exception e) {
            log.error("学生登录失败", e);
            return new ResponseUtils<>(400, "登录查询异常");
        }
    }
}

package cn.lanqiao.studentgradesmanagesystem.controller;


import cn.lanqiao.studentgradesmanagesystem.model.dto.TeacherLoginDTO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.service.TeacherloginService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Teacher")
@CrossOrigin
public class TeacherloginController {
    @Autowired
    private TeacherloginService teacherService;
    @Autowired
    private TeacherloginService teacherloginService;

    @PostMapping("/login")
    public ResponseUtils login(@RequestBody TeacherLoginDTO loginDTO, HttpServletRequest request) {
        try {
            Teacher teacher = teacherloginService.login(loginDTO);
            if (teacher == null) {
                return new ResponseUtils<>(500, "登录失败");
            }
            HttpSession session = request.getSession();
            session.setAttribute("teacherLogin",teacher.getTeaId());
            return new ResponseUtils<>(200, "登录成功", teacher);
        } catch (Exception e) {
            log.error("教师登录失败", e);
            return new ResponseUtils<>(400, "登录查询异常");
        }
    }
}

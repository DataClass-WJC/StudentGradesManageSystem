package cn.lanqiao.studentgradesmanagesystem.controller;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.AdminVO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import cn.lanqiao.studentgradesmanagesystem.service.AdminService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Admin")
@CrossOrigin
public class Admincontroller {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public ResponseUtils login(@RequestBody Adminatp adminLogin, HttpServletResponse response) {
        try {
            // Call service layer for login
            Admin admin = adminService.loginAdm(adminLogin);
            if (admin == null) {
                return new ResponseUtils<>(500, "登录失败");
            }

            // Create AdminVO for response
            AdminVO adminVO = new AdminVO();
            adminVO.setAdminId(admin.getAdminId());
            return new ResponseUtils<>(200, "登录成功", adminVO);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils<>(400, "登录查询异常");
        }
    }
}

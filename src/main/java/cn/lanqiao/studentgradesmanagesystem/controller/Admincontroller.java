package cn.lanqiao.studentgradesmanagesystem.controller;


import cn.lanqiao.studentgradesmanagesystem.model.dto.QueryRequest;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.AdminVO;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import cn.lanqiao.studentgradesmanagesystem.service.AdminService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @RequestMapping("/list")
    public ResponseUtils list(@RequestBody QueryRequest queryRequest, HttpServletResponse httpServletResponse, HttpServletRequest request){
        HttpSession session = request.getSession();
        Object studentLoginObj = session.getAttribute("studentLogin");
        int IdNum = studentLoginObj instanceof String ? Integer.parseInt((String) studentLoginObj) : (Integer) studentLoginObj;
//        //查询总记录数
        Integer t = adminService.selectTotal(IdNum);
//        可以分的总页数
        Integer totalNUm =(int)Math.ceil((double)t/4);
        String total = String.valueOf(totalNUm);
        Cookie cookie = new Cookie("total",total);
        // 设置cookie的存活时间
        cookie.setMaxAge(60 * 60 * 24);
        // 设置cookie的路径，使其在整个应用中可用
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);
        // 计算偏移量(起始索引) （查询页码-1）*每页显示记录数。
        int offset = (queryRequest.getPageNum() - 1) * queryRequest.getPageSize();

//        System.out.println("这是："+IdNum);
        List<QueryRequest> results = adminService.selectList(offset,IdNum);
        if(results!=null){
            return new ResponseUtils(200,"查询成功",results);

        }else{
            return new ResponseUtils(500,"查询失败");
        }
    }

}

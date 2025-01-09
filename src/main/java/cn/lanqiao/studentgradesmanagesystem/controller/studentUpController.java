package cn.lanqiao.studentgradesmanagesystem.controller;



import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import cn.lanqiao.studentgradesmanagesystem.service.studentUpService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class studentUpController {
@Autowired
private studentUpService students;

    @RequestMapping("/update")
    public ResponseUtils update( HttpServletRequest request){
        try {
            HttpSession session = request.getSession();
            Object studentLogin = session.getAttribute("studentLogin");
            Object update = students.update(studentLogin);
//            System.out.println(update);
            if(update==null){
                return new ResponseUtils<>(500, "登录失败");
            }else {

                return new ResponseUtils<>(200, "登录成功", update);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/updates")
    public ResponseUtils updates(@RequestBody Student student){
        System.out.println(student);
        int updates = students.updates(student);
        System.out.println(updates);
        if(updates==0){
            return new ResponseUtils<>(500, "修改失败");
        }else {
            return new ResponseUtils<>(200, "修改成功");
        }
    }
}

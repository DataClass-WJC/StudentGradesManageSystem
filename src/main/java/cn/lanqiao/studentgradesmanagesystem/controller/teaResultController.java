package cn.lanqiao.studentgradesmanagesystem.controller;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Result;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.service.TeacherloginService;
import cn.lanqiao.studentgradesmanagesystem.service.resultService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tea")
public class teaResultController {
    @Autowired
    private resultService resultService;
    @Autowired
    private TeacherloginService teacherloginService;
    //添加成绩
    @RequestMapping("/addResult")
    public ResponseUtils addResult(@RequestBody Result result){
        try {
            int addResult = resultService.addResult(result);
            if (addResult > 0) {
                return new ResponseUtils<>(200,"添加成功");
            }else {
                return new ResponseUtils<>(500,"添加失败");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    //修改成绩
    @RequestMapping("/updateResult")
    public ResponseUtils updateResult(@RequestBody Result result){
        try {
            int updateResult = resultService.updateByResId(result);
//            System.out.println(updateResult);
            if (updateResult > 0) {
                return new ResponseUtils<>(200,"修改成功");
            }else {
                return new ResponseUtils<>(500,"修改失败");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    //删除成绩
    @RequestMapping("/deleteResult")
    public ResponseUtils deleteResult(@RequestBody Result result) {
        try {
            // 拿到参数之后我们就可以去执行sql删除了
            int deleteResult = resultService.deleteResult(result.getResId());
//            System.out.println(deleteResult);
            if (deleteResult == 1){
                // 删除成功
                return new ResponseUtils(200, "删除成功");
            } else {
                return new ResponseUtils(500, "删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils(400, "删除异常");
        }
    }

    //分页查询


    /**
     * 查询所有信息
     */

    @RequestMapping("/getAllResult")
    public ResponseUtils getAllResult(){
        try {
            List<Result> allResult = resultService.getAllResult();
//            System.out.println(allResult);
            if(allResult == null){
                return new ResponseUtils(500,"查询失败");
            }else {
                return new ResponseUtils<>(200,"查询成功",allResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils<>(400,"查询异常");
        }
    }

    /**
     * 查询个人信息
     */
    @RequestMapping("/getByResId")
    public ResponseUtils getByResId(@RequestBody Result result){
        try {
            List<Result> resByStuId = resultService.getResByStuId(result.getStuId());
            System.out.println(resByStuId);
            if(resByStuId != null){
                return new ResponseUtils(200,"查询成功",resByStuId);
            }else {
                return new ResponseUtils(500,"查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
//            return new ResponseUtils(400,"查询异常");
            throw new RuntimeException();
        }
    }

    //    渲染
    @RequestMapping("/selectTea")
    public ResponseUtils selectTea(HttpServletRequest request){
        try {
            HttpSession session = request.getSession();
            Object teacherLogin = session.getAttribute("teacherLogin");
            Teacher teacher = teacherloginService.selectTea(teacherLogin);
            if(teacher==null){
                return new ResponseUtils<>(500, "登录失败");
            }else {

                return new ResponseUtils<>(200, "登录成功", teacher);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/updateTeas")
    public ResponseUtils updateTea(@RequestBody Teacher teacher){
        try {
            System.out.println(111);
            System.out.println(teacher);
            int teacher1 = teacherloginService.selectTeas(teacher);
            System.out.println(teacher1);
            if(teacher1==0){
                return new ResponseUtils<>(500, "修改失败");
            }else {
                return new ResponseUtils<>(200, "修改成功");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

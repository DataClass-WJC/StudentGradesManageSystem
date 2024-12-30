package cn.lanqiao.studentgradesmanagesystem.controller;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import cn.lanqiao.studentgradesmanagesystem.result.Result;
import cn.lanqiao.studentgradesmanagesystem.service.teacherService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
@Slf4j
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


    /***
     * 学生成绩信息管理系统 教师管理
     */


    /***
     * 查询教师信息
     * @return
     */
    // 查询所有教师
    @GetMapping
    public Result<List<Teacher>> selectAll() {
        log.info("查询所有教师");
        List<Teacher> list = teacherService.list();
        return Result.success(list);
    }

    // 按ID查询教师 和数据回显功能
    @GetMapping("/{teaId}")
    public Result<Teacher> selectById(@PathVariable Integer teaId) {
        log.info("参数{}", teaId);
        Teacher teacher = teacherService.lambdaQuery()
                .eq(Teacher::getTeaId, teaId)
                .one();
        if (teacher == null) {
            return Result.error("教师不存在");
        }
        return Result.success(teacher);
    }

    /***
     * 添加教师信息
     */

    @PostMapping
    public Result<String> save(@RequestBody Teacher teacher){
        log.info("添加教师数据参数{}", teacher);
        boolean result = teacherService.save(teacher);
        if (result){
            return Result.success("添加成功");
        }else {
            return Result.error("添加失败");
        }

    }

    /***
     * 删除数据
     * @param teaId
     * @return
     */
    @DeleteMapping("/delete")
    public Result delete (@RequestParam Integer teaId){
        log.info("根据教师工号删除单个数据{}",teaId);
        teacherService.deleteById(teaId);
        return Result.success("删除成功");
    }


    /***
     * 修改数据
     * @param teacher
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody Teacher teacher){
        log.info("修改信息{}", teacher);
        // 根据id更新数据
        boolean result = teacherService.update(teacher, new UpdateWrapper<Teacher>().eq("tea_id", teacher.getTeaId()));
        if (result){
            return Result.success("修改成功");
        } else {
            return Result.error("修改失败");
        }
    }

}

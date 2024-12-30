package cn.lanqiao.studentgradesmanagesystem.controller;


import cn.lanqiao.studentgradesmanagesystem.model.dto.StudentDto;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Student;
import cn.lanqiao.studentgradesmanagesystem.result.Result;
import cn.lanqiao.studentgradesmanagesystem.service.IStudentService;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2024-12-29
 */
@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {
    @Autowired
    private IStudentService iStudentService;
    /***
     *数据查询
     */

    @GetMapping
    public Result<List<Student>> select(StudentDto studentDto) {
        log.info("参数{}",studentDto);
        List<Student> list = iStudentService.lambdaQuery()
                .eq(studentDto.getStuId() != null, Student::getStuId, studentDto.getStuId())
                .eq(studentDto.getClassName() != null, Student::getStuClass, studentDto.getClassName())
                .list();
        return Result.success(list);
    }


    /***
     * 删除数据
     * @param stuId
     * @return
     */

    @DeleteMapping("/delete")
    public Result delete (@RequestParam Integer stuId){
        log.info("根据id删除单个数据{}",stuId);
        boolean result = iStudentService.removeById(stuId);
        if (result){
            return Result.success("删除成功");
        }else {
            return Result.error("删除失败");
        }
    }


    /***
     * 添加数据
     */
    @PostMapping
    public Result<String> save(@RequestBody Student student){
        log.info("添加医生数据参数{}", student);
        boolean result = iStudentService.save(student);
        if (result){
            return Result.success("添加成功");
        }else {
            return Result.error("添加失败");
        }

    }


    /***
     * 查询回显
     */

    @GetMapping("/{stuId}")
    public Result<Student> getById(@PathVariable Integer stuId){
        log.info("根据id查询回显{}",stuId);
        LambdaQueryChainWrapper<Student> doctor = iStudentService.lambdaQuery().eq(Student::getStuId, stuId);
        return Result.success(doctor.one());
    }

    /***
     * 修改数据
     * @param student
     * @return
     */
    @PutMapping("/update")
    public  Result update(@RequestBody Student student){
        log.info("修改信息{}",student);
        //根据id来修改数据
        boolean result = iStudentService.updateById(student);
        if (result){
            return Result.success("修改成功");
        }else {
            return Result.error("修改失败");
        }
    }
}

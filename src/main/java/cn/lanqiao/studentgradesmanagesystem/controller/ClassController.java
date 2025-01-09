package cn.lanqiao.studentgradesmanagesystem.controller;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Class;
import cn.lanqiao.studentgradesmanagesystem.service.ClassService;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Class")
@CrossOrigin
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/getAllClasses")
    public ResponseUtils getAllClasses() {
        try {
            List<Class> classes = classService.getAllClasses();
            if (classes != null && !classes.isEmpty()) {
                return new ResponseUtils(200, "查询成功", classes);
            } else {
                return new ResponseUtils<String>(500, "暂无班级信息");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils(400, "查询异常");
        }
    }

    @GetMapping("/getClassByName")
    public ResponseUtils getClassByName(@RequestParam String className) {
        try {
            List<Class> classes = classService.getClassByName(className);
            if (classes != null && !classes.isEmpty()) {
                return new ResponseUtils(200, "查询成功", classes);
            } else {
                return new ResponseUtils<String>(500, "未找到相关班级");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils(400, "查询异常");
        }
    }

    @PostMapping("/addClass")
    public ResponseUtils addClass(@RequestBody Class classList) {
        try {
            // 验证输入
            if (classList.getClassId() == null || classList.getClassName() == null ||
                    classList.getClassId().trim().isEmpty() || classList.getClassName().trim().isEmpty()) {
                return new ResponseUtils(304, "班级信息不能为空");
            }

            // 检查班级ID是否已存在
            Class existingClass = classService.getClassById(classList.getClassId());
            if (existingClass != null) {
                return new ResponseUtils(304, "班级编号已存在");
            }

            // 添加班级
            int result = classService.addClass(classList);
            if (result > 0) {
                return new ResponseUtils(200, "添加成功");
            } else {
                return new ResponseUtils(304, "添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils(304, "添加异常");
        }
    }

    //   删除
    @DeleteMapping("/deleteClass/{classId}")  // 修改路径参数格式
    public ResponseUtils deleteClass(@PathVariable String classId) {
        try {
            // 先检查班级是否存在
            Class existingClass = classService.getClassById(classId);
            if (existingClass == null) {
                return new ResponseUtils(304, "班级不存在");
            }

            int result = classService.deleteClass(classId);
            if (result > 0) {
                return new ResponseUtils(200, "删除成功");
            } else {
                return new ResponseUtils(304, "删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils(304, "删除异常");
        }
    }
    @PutMapping("/updateClass")
    public ResponseUtils updateClass(@RequestBody Class classList) {
        try {
            // 验证输入
            if (classList.getClassId() == null || classList.getClassName() == null ||
                    classList.getClassId().trim().isEmpty() || classList.getClassName().trim().isEmpty()) {
                return new ResponseUtils(304, "班级信息不能为空");
            }

            // 检查班级是否存在
            Class existingClass = classService.getClassById(classList.getClassId());
            if (existingClass == null) {
                return new ResponseUtils(304, "班级不存在");
            }

            // 更新班级
            int result = classService.updateClass(classList);
            if (result > 0) {
                return new ResponseUtils(200, "更新成功");
            } else {
                return new ResponseUtils(304, "更新失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtils(304, "更新异常");
        }
    }
}

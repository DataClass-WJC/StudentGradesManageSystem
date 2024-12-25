package cn.lanqiao.studentgradesmanagesystem.controller;

import cn.lanqiao.studentgradesmanagesystem.service.resultService;
import cn.lanqiao.studentgradesmanagesystem.pojo.Result;
import cn.lanqiao.studentgradesmanagesystem.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tea")
public class teaResultController {
    @Autowired
    private resultService resultService;
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


    /**
     * 查询所有信息
     */

    @RequestMapping("/getAllResult")
    public ResponseUtils getAllResult(){
        try {
            List<Result> allResult = resultService.getAllResult();
            System.out.println(allResult);
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
}

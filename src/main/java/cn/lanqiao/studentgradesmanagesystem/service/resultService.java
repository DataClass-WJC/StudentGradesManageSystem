package cn.lanqiao.studentgradesmanagesystem.service;

import cn.lanqiao.studentgradesmanagesystem.pojo.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface resultService {
    int addResult(Result result);
    List<Result> getAllResult();
    //修改
    int updateByResId(Result result);
    //删除
    int deleteResult(int resId);
}

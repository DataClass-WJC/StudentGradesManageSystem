package cn.lanqiao.studentgradesmanagesystem.service;

import cn.lanqiao.studentgradesmanagesystem.pojo.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface resultService {
    int addResult(Result result);
    List<Result> getAllResult();
    int updateResult(Result result);
    int deleteResult(int resId);

    List<Result> getResByStuId(@Param("stuId") String stuId);
}

package cn.lanqiao.studentgradesmanagesystem.service;



import cn.lanqiao.studentgradesmanagesystem.model.pojo.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface resultService {
    int addResult(Result result);
    List<Result> getAllResult();
    int updateByResId(Result result);
    List<Result> getResByStuId(@Param("stuId") String stuId);
}

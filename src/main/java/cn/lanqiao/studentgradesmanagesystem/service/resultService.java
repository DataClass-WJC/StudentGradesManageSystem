package cn.lanqiao.studentgradesmanagesystem.service;



import cn.lanqiao.studentgradesmanagesystem.model.pojo.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface resultService {
    /**
     * 根据Id修改成绩
     */
    int updateResult(Result result);
    /**
     * 删除成绩
     */
    int deleteResult(int resId);
    int addResult(Result result);
    List<Result> getAllResult();
    int updateByResId(Result result);
    List<Result> getResByStuId(@Param("stuId") String stuId);
}

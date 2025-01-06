package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface resultMapper {
    /**
     * 添加成绩
     * @param result
     * @return
     */
    int addResult(@Param("result") Result result);

    /**
     * 根据Id修改成绩
     */
    int updateResult(@Param("result") Result result);
    /**
     * 删除成绩
     */
    int deleteResult(int resId);

    /**
     * 查询所有成绩
     */

    List<Result> getAllResult();

    /**
     * 根据学号查询成绩
     */

    List<Result> getResByStuId(@Param("stuId") String stuId);
}

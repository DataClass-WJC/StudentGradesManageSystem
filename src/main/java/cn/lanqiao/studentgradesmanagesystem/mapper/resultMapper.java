package cn.lanqiao.studentgradesmanagesystem.mapper;

import cn.lanqiao.studentgradesmanagesystem.pojo.Result;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface resultMapper {
    /**
     * 添加成绩
     * @param result
     * @return
     */
    int addResult(@Param("result") Result result);

    /**
     * 查询所有成绩
     */
    @Select("select * from result")
    List<Result> getAllResult();
}

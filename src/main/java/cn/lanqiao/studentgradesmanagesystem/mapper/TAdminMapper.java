package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.model.dto.QueryRequest;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Admin;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Adminatp;
import cn.lanqiao.studentgradesmanagesystem.model.pojo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TAdminMapper {


    Admin loginAdm(Adminatp admin);
    //查询当前用户的成绩
    @Select("select * from result where stu_id=1 ")
    List<Result> selectResultByStuId();
    //    分页
    @Results({
            @org.apache.ibatis.annotations.Result(id = true,property = "res_id",column = "res_id"),
            @org.apache.ibatis.annotations.Result(property = "stu_id",column = "stu_id"),
            @org.apache.ibatis.annotations.Result(property = "stu_pass",column = "stu_pass"),
            @org.apache.ibatis.annotations.Result(property = "stu_class",column = "stu_class"),
            @org.apache.ibatis.annotations.Result(property = "stu_sex",column = "stu_sex"),
            @org.apache.ibatis.annotations.Result(property = "stu_tele",column = "stu_tele"),
            @org.apache.ibatis.annotations.Result(property = "res_num",column = "res_num"),
            @org.apache.ibatis.annotations.Result(property = "res_term",column = "res_term"),
            @org.apache.ibatis.annotations.Result(property = "sub_name",column = "sub_name"),
            @org.apache.ibatis.annotations.Result(property = "total",column = "total"),
    })
    @Select("select * from result where stu_id = #{stu_id} limit #{size},4")
    List<QueryRequest> selectList(int size,int stu_id);
    //    查总数
    @Select("select count(*) from result where stu_id = #{stu_id}")
    Integer selectTotal(int stu_id);
}

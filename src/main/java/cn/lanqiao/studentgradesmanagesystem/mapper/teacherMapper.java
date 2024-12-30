package cn.lanqiao.studentgradesmanagesystem.mapper;


import cn.lanqiao.studentgradesmanagesystem.model.pojo.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface teacherMapper extends BaseMapper<Teacher> {
    /**
     * 登录
     */
    @Select("select * from teacher where teaName=#{teaName} and teaPass=#{teaPass}")
    Teacher login(Teacher teacher);

    /***
     * 删除
     * @param teaId
     */

    @Delete("delete from teacher where tea_id=#{teaId}")
    void delete(Integer teaId);
}

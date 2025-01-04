package cn.lanqiao.studentgradesmanagesystem.service.impl;


import cn.lanqiao.studentgradesmanagesystem.mapper.resultMapper;

import cn.lanqiao.studentgradesmanagesystem.model.pojo.Result;
import cn.lanqiao.studentgradesmanagesystem.service.resultService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class resultServiceImpl implements resultService {
    @Autowired
    private resultMapper resultMapper;
    @Override
    public int addResult(Result result) {
        int result1 = resultMapper.addResult(result);
        if (result1 > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public List<Result> getAllResult() {
        List<Result> allResult = resultMapper.getAllResult();
//        System.out.println(allResult);
        if (allResult != null) {
            return allResult;
        }else {
            return null;
        }
    }

    @Override
    public int updateResult(Result result) {
        int result1 = resultMapper.updateResult(result);
        if (result1 > 0) {
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public int deleteResult(int resId) {
        try {
            int result = resultMapper.deleteResult(resId);
            if (result > 0) {
                // 删除成功
                return 1;
            } else {
                return 0;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public List<Result> getResByStuId(String stuId) {
        try {
            List<Result> resByStuId = resultMapper.getResByStuId(stuId);
            if (resByStuId != null) {
                return resByStuId;
            }else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}

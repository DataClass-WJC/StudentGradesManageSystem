package cn.lanqiao.studentgradesmanagesystem.service.Impl;

import cn.lanqiao.studentgradesmanagesystem.mapper.resultMapper;
import cn.lanqiao.studentgradesmanagesystem.pojo.Result;
import cn.lanqiao.studentgradesmanagesystem.service.resultService;
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
        System.out.println(allResult);
        if (allResult != null) {
            return allResult;
        }else {
            return null;
        }
    }

    @Override
    public int updateByResId(Result result) {
        int result1 = resultMapper.updateByResId(result);
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

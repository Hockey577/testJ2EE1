package service.impl;

import dao.ExamDao;
import dto.CommonResult;
import entity.ExamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ExamService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-1.
 */
@Service
public class ExamServiceImpl implements ExamService{
    @Autowired
    private ExamDao examDao;

    public ExamEntity getExamResult(long sid) {
        return examDao.queryById(sid);
    }

    //添加考研记录
    public int addRecord(ExamEntity exam) {
        int i = examDao.addRecord(exam);
        return i;
    }

    public int modifyRecord(ExamEntity exam) {
        int i = examDao.modifyRecord(exam);
        return i;
    }


}

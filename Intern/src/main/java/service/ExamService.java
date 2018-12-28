package service;

import entity.ExamEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-1.
 */
public interface ExamService {
    ExamEntity getExamResult(long sid);

    /**
     * 提交考研结果
     * @param exam
     * @return
     */
    int addRecord(ExamEntity exam);

    int modifyRecord(ExamEntity exam);
}

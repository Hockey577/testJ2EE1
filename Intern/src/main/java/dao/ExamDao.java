package dao;

import entity.ExamEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-1.
 */
public interface ExamDao {
    ExamEntity queryById(long sid);

    //添加考研结果
    int addRecord(ExamEntity examEntity);

    //修改考研结果
    int modifyRecord(ExamEntity examEntity);
}

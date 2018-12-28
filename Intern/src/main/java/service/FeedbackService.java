package service;

import entity.FeedbackEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-25.
 */
public interface FeedbackService {
    int addRecord(FeedbackEntity feedback);

    //返回企业收到的反馈
    List<FeedbackEntity> queryCom(long sperson);

    //返回学生收到的反馈
    List<FeedbackEntity> queryStu(long sperson);

    //返回教师收到的反馈（来自学生）
    List<FeedbackEntity> queryS2Tea(long sperson);

    //返回教师收到的反馈（来自公司）
    List<FeedbackEntity> queryC2Tea(long sperson);
}

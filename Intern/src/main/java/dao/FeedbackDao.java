package dao;

import entity.FeedbackEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017-9-25.
 */
public interface FeedbackDao {
    int addRecord(FeedbackEntity feedback);

    //返回某学生收到的反馈
    List<FeedbackEntity> queryStu(long sperson);

    //返回某教师收到的反馈（来自学生）
    List<FeedbackEntity> queryS2Tea(long sperson);

    //返回某教师收到的反馈（来自公司）
    List<FeedbackEntity> queryC2Tea(long sperson);

    //返回某企业收到的反馈
    List<FeedbackEntity> queryCom(long sperson);
}

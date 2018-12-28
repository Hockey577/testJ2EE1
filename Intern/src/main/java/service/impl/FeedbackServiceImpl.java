package service.impl;

import dao.FeedbackDao;
import entity.FeedbackEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.FeedbackService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-25.
 */

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackDao feedbackDao;


    public int addRecord(FeedbackEntity feedback) {
        int i = feedbackDao.addRecord(feedback);
        return i;
    }

    public List<FeedbackEntity> queryCom(long sperson) {
        return feedbackDao.queryCom(sperson);
    }

    public List<FeedbackEntity> queryStu(long sperson) {
        return feedbackDao.queryStu(sperson);
    }

    public List<FeedbackEntity> queryS2Tea(long sperson) {
        return feedbackDao.queryS2Tea(sperson);
    }

    public List<FeedbackEntity> queryC2Tea(long sperson) {
        return feedbackDao.queryC2Tea(sperson);
    }


}

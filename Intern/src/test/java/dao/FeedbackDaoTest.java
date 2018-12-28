package dao;

import entity.FeedbackEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by Administrator on 2017-10-19.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class FeedbackDaoTest {
    @Resource
    private FeedbackDao feedbackDao;

    @Test
    public void queryStu() throws Exception {
        List<FeedbackEntity> feedbackEntities = feedbackDao.queryStu(1001);
        System.out.println(feedbackEntities);
    }

}
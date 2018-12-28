package service.impl;

import entity.FeedbackEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.FeedbackService;

import java.util.List;

/**
 * Created by Administrator on 2017-10-19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class FeedbackServiceImplTest {

    @Autowired
    private FeedbackService feedbackService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void queryStu() throws Exception {
        List<FeedbackEntity> list = feedbackService.queryStu(1001);
        logger.info(""+ list);
    }

}
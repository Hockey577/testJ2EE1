package service.impl;

import entity.StudentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.StudentService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017-8-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class StudentServiceImplTest {
    @Autowired
    private StudentService studentService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void checkLogin() throws Exception {
        StudentEntity studentEntity = studentService.checkLogin(1003,"123456","光明大学");
        logger.info("" + studentEntity);
    }

    @Test
    public void getTelList() throws Exception {
        List<Object> list = studentService.getTelList(1001);
        logger.info(""+list);
    }

//    @Test
//    public void saveCode() throws Exception {
//        int i = studentService.saveCode(1001,"123");
//        logger.info("" + i);
//    }

}
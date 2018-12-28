package dao;

import entity.StudentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2017-8-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {

    @Resource
    private StudentDao studentDao;

    @Test
    public void checkLogin() throws Exception {
        StudentEntity studentEntity = studentDao.checkLogin(1002);
        System.out.println(studentEntity);
    }

//    @Test
//    public void saveCode() throws Exception {
//        int i = studentDao.saveCode(1001,123);
//        System.out.println(i);
//    }

}
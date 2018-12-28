package service.impl;

import dao.StudentDao;
import dto.CommonResult;
import entity.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public StudentEntity checkLogin(long sid, String spassword,String sschool) {
        StudentEntity studentEntity = studentDao.checkLogin(sid);
        if (studentEntity != null && studentEntity.getSpassword().equals(spassword)
                &&studentEntity.getSschool().equals(sschool)){
            return studentEntity;
        }
        else
            return null;
    }

    public List<Object> getTelList(long sid) {
        List<Object> list = new ArrayList<Object>();
        List<Object> list1 = studentDao.queryByStu(sid);
        List<Object> list2 = studentDao.queryByCom(sid);
        list.add(list1);
        list.add(list2);
        return list;
    }

    public int saveCode(long sid, String scode,String sphone) {
        long code = Long.valueOf(scode);
        int result = studentDao.saveCode(sid,code,sphone);
        return result;
    }

    public int modifyPwd(String sphone, long scode, String spassword) {
        StudentEntity studentEntity = studentDao.checkCode(sphone,scode);
        if (studentEntity.getScode() == scode) {
            int i = studentDao.modifyPwd(sphone, spassword);
            if (i == 1)
                return i;
            else
                return 0;
        }
        else
            return -1;
    }

    public int saveToken(String token,long sid) {
        int i = studentDao.saveToken(token,sid);
        return i;
    }

    public List<StudentEntity> queryAll() {
        return studentDao.queryAll();
    }
}

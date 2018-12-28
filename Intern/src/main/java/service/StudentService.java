package service;

import dto.CommonResult;
import entity.StudentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
public interface StudentService {

    //检查登录
    StudentEntity checkLogin(long sid, String spassword,String sschool);

    //返回通讯录
    List<Object> getTelList(long sid);

    //保存验证码
    int saveCode(long sid,String scode,String sphone);

    //重置密码
    int modifyPwd(String sphone, long scode, String spassword);

    //保存token
    int saveToken(String token,long sid);

    //返回学生列表
    List<StudentEntity> queryAll();
}

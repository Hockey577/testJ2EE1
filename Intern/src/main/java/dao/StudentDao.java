package dao;

import entity.CompanyEntity;
import entity.StudentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
public interface StudentDao {
    //验证登录
    StudentEntity checkLogin(long sid);

    //返回通讯录——学生联系人
    List<Object> queryByStu(long sid);

    //返回通讯录——公司联系人
    List<Object> queryByCom(long sid);

    //保存验证码
    int saveCode(@Param("sid") long sid, @Param("scode") long scode,@Param("sphone") String sphone);

    //验证手机号和验证码是否匹配
    StudentEntity checkCode(@Param("sphone") String sphone,@Param("scode") long scode);

    //重置密码
    int modifyPwd(@Param("sphone") String sphone, @Param("spassword") String spassword);

    //保存token
    int saveToken(@Param("stoken") String token,@Param("sid")long sid);

    //返回学生列表
    List<StudentEntity> queryAll();
}

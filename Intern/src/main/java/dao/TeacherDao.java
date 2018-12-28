package dao;

import entity.TeacherEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-27.
 */
public interface TeacherDao {
    //返回教师列表
    List<TeacherEntity> queryAll();
}

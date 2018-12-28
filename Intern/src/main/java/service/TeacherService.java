package service;

import entity.TeacherEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-27.
 */
public interface TeacherService {

    //返回老师列表
    List<TeacherEntity> queryAll();
}

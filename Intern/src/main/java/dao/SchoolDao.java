package dao;

import entity.SchoolEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-8-26.
 */
public interface SchoolDao {
    //返回学校列表
    List<SchoolEntity> queryAll();
}

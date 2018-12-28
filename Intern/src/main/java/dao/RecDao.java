package dao;

import entity.RecEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-11-1.
 */
public interface RecDao {

    //返回考研建议列表
    List<RecEntity> queryAll();

    //添加考研建议
    int addRecord(RecEntity recEntity);
}

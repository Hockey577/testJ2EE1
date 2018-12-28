package service;

import entity.RecEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-11-1.
 */
public interface RecService {
    List<RecEntity> queryAll();

    //添加考研资料
    int addRecord(RecEntity recEntity);
}

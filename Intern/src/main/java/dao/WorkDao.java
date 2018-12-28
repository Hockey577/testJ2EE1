package dao;

import entity.WorkEntity;

/**
 * Created by Administrator on 2017-9-19.
 */
public interface WorkDao {
    //上传考勤记录
    int addRecord(WorkEntity work);


}

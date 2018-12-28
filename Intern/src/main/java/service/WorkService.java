package service;

import entity.WorkEntity;

/**
 * Created by Administrator on 2017-9-19.
 */
public interface WorkService {
    //上传考勤记录
    int addRecord(WorkEntity work);
}

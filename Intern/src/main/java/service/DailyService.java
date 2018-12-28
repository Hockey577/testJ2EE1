package service;

import entity.DailyEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-23.
 */
public interface DailyService {
    //提交日报
    int addRecord(DailyEntity daily);

    List<DailyEntity> queryById(long sid);
}

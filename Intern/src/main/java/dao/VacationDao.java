package dao;

import entity.VacationEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-24.
 */
public interface VacationDao {
    //提交请假记录
    int addRecord(VacationEntity vacation);

    List<VacationEntity> queryById(long sid);
}

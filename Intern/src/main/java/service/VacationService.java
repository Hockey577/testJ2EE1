package service;

import entity.VacationEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-9-24.
 */
public interface VacationService {

    //提交请假记录
    int addRecord(VacationEntity vacation);

    //获取列表
    List<VacationEntity> queryById(long sid);
}

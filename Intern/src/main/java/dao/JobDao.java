package dao;

import entity.JobEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
public interface JobDao {
    /**
     * 获取所有职业
     * @return
     */
    List<JobEntity> queryAll();
}

package service;

import entity.JobEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
public interface JobService {
    /**
     * 返回所有职业
     * @return
     */
    List<JobEntity> getJobList();
}

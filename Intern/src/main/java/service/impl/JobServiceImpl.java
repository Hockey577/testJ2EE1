package service.impl;

import dao.JobDao;
import entity.JobEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.JobService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<JobEntity> getJobList() {
        return jobDao.queryAll();
    }
}

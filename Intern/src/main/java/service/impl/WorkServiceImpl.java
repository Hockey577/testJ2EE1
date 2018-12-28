package service.impl;

import dao.WorkDao;
import entity.WorkEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.WorkService;

/**
 * Created by Administrator on 2017-9-19.
 */
@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkDao workDao;
    public int addRecord(WorkEntity work) {
        int i = workDao.addRecord(work);
        return i;
    }
}

package service.impl;

import dao.DailyDao;
import entity.DailyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DailyService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-23.
 */
@Service
public class DailyServiceImpl implements DailyService{
    @Autowired
    private DailyDao dailyDao;


    public int addRecord(DailyEntity daily) {
        int i = dailyDao.addRecord(daily);
        return i;
    }

    public List<DailyEntity> queryById(long sid) {
        return dailyDao.queryById(sid);
    }
}

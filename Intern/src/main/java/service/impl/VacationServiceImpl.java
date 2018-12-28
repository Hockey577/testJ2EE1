package service.impl;

import dao.VacationDao;
import entity.VacationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.VacationService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-24.
 */
@Service
public class VacationServiceImpl implements VacationService{
    @Autowired
    private VacationDao vacationDao;


    public int addRecord(VacationEntity vacation) {
        int i = vacationDao.addRecord(vacation);
        return i;
    }

    public List<VacationEntity> queryById(long sid) {
        return vacationDao.queryById(sid);
    }
}

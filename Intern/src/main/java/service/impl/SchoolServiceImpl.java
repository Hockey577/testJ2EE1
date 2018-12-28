package service.impl;

import dao.SchoolDao;
import entity.SchoolEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SchoolService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-26.
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolDao schoolDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<SchoolEntity> getSchoolList() {
        return schoolDao.queryAll();
    }
}

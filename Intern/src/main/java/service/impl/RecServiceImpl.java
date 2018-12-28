package service.impl;

import dao.RecDao;
import entity.RecEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.RecService;

import java.util.List;

/**
 * Created by Administrator on 2017-11-2.
 */
@Service
public class RecServiceImpl implements RecService {
    @Autowired
    private RecDao recDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<RecEntity> queryAll() {
        return recDao.queryAll();
    }

    //添加考研资料
    public int addRecord(RecEntity recEntity) {
        int i = recDao.addRecord(recEntity);
        return i;
    }
}

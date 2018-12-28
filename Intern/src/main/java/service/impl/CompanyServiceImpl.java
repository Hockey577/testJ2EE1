package service.impl;

import dao.CompanyDao;
import entity.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CompanyService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */
@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyDao companyDao;

    public CompanyEntity getDetail(long cid) {
        return companyDao.queryById(cid);
    }

    public List<CompanyEntity> queryAll() {
        return companyDao.queryAll();
    }
}

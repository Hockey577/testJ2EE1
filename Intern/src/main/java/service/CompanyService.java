package service;

import entity.CompanyEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */
public interface CompanyService {
    CompanyEntity getDetail(long cid);

    //获取列表
    List<CompanyEntity> queryAll();
}

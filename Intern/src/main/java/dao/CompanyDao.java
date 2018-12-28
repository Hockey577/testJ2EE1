package dao;

import entity.CompanyEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */
public interface CompanyDao {
    //获取公司信息
    CompanyEntity queryById(long cid);

    //获取公司列表
    List<CompanyEntity> queryAll();
}

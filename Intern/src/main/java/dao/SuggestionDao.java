package dao;

import entity.SuggestionEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-11-4.
 */
public interface SuggestionDao {
    //返回所有考研建议
    List<SuggestionEntity> queryAll();

    //发布考研建议
    int addRecord(SuggestionEntity sug);
}

package service;

import entity.SuggestionEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-11-4.
 */
public interface SuggestionService {
    List<SuggestionEntity> queryAll();

    int addRecord(SuggestionEntity suggestion);
}

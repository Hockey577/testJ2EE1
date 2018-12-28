package service.impl;

import dao.SuggestionDao;
import entity.SuggestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SuggestionService;

import java.util.List;

/**
 * Created by Administrator on 2017-11-4.
 */
@Service
public class SugServiceImpl implements SuggestionService {

    @Autowired
    private SuggestionDao suggestionDao;

    public List<SuggestionEntity> queryAll() {
        return suggestionDao.queryAll();
    }

    public int addRecord(SuggestionEntity suggestion) {
        int i = suggestionDao.addRecord(suggestion);
        return i;
    }
}

package service.impl;

import dao.TeacherDao;
import entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TeacherService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-27.
 */
@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherDao teacherDao;

    public List<TeacherEntity> queryAll() {
        return teacherDao.queryAll();
    }
}

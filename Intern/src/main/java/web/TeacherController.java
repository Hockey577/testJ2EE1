package web;

import dto.ListResult;
import entity.TeacherEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TeacherService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-27.
 */
@Controller
@RequestMapping("/tea")
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public ListResult<TeacherEntity> queryAll(){
        ListResult<TeacherEntity> result;
        try {
            List<TeacherEntity> list = teacherService.queryAll();
            result = new ListResult<TeacherEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            result = new ListResult<TeacherEntity>(false, e.getMessage(), "500");
        }
        return result;
    }
}

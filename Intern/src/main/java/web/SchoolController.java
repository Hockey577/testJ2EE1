package web;

import dto.ListResult;
import entity.SchoolEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SchoolService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-26.
 */
@Controller
@RequestMapping("/sch")
public class SchoolController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public ListResult<SchoolEntity> getList(){
        ListResult<SchoolEntity> result;
        try {
            List<SchoolEntity> schoolEntities = schoolService.getSchoolList();
            result = new ListResult<SchoolEntity>(true,schoolEntities,"200");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            result = new ListResult<SchoolEntity>(false, e.getMessage(), "500");
        }
        return result;
    }
}

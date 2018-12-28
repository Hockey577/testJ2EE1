package web;

import dto.ListResult;
import entity.JobEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.JobService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
@Controller
@RequestMapping("/job")
public class JobController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<JobEntity> getList(){
        ListResult<JobEntity> result;
        try {
            List<JobEntity> jobEntities = jobService.getJobList();
            result = new ListResult<JobEntity>(true,jobEntities,"200");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            result = new ListResult<JobEntity>(false, e.getMessage(), "500");
        }
       return result;
    }

}

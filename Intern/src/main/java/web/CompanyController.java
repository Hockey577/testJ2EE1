package web;

import dto.CommonResult;
import dto.ListResult;
import dto.ObjectResult;
import entity.CompanyEntity;
import entity.JobEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CompanyService;

import java.util.List;

/**
 * Created by Administrator on 2017-8-27.
 */
@Controller
@RequestMapping("/com")
public class CompanyController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/detail", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ObjectResult getDetail(@RequestBody CompanyEntity companyEntity){
        ObjectResult result;
        try {
            CompanyEntity company = companyService.getDetail(companyEntity.getCid());
            result = new ObjectResult(true,"200",company);

        } catch (Exception e) {
            result = new ObjectResult(true,"500",e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<CompanyEntity> queryAll(){
        ListResult<CompanyEntity> result;
        try {
            List<CompanyEntity> list = companyService.queryAll();
            result = new ListResult<CompanyEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            result = new ListResult<CompanyEntity>(false, e.getMessage(), "500");
        }
        return result;
    }
}

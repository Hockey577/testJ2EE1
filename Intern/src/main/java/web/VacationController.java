package web;

import dto.CommonResult;
import dto.ListResult;
import entity.DailyEntity;
import entity.VacationEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.VacationService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-24.
 */
@Controller
@RequestMapping("/vacation")
public class VacationController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private VacationService vacationService;

    @RequestMapping(value = "/addRecord",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CommonResult addRecord(@RequestBody VacationEntity vacation){
        CommonResult result;
        try{
            int i = vacationService.addRecord(vacation);
            if (i > 0)
                result = new CommonResult(true, "提交成功");
            else
                result = new CommonResult(false, "500", "提交失败,找糊七七");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            result = new CommonResult(false,"500",e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<VacationEntity> getList(@RequestBody VacationEntity vacation){
        ListResult<VacationEntity> result;
        try{
            List<VacationEntity> vacationList = vacationService.queryById(vacation.getSid());
            result = new ListResult<VacationEntity>(true,vacationList,"200");
        }catch (Exception e){
            logger.error(e.getMessage());
            result = new ListResult<VacationEntity>(false,e.getMessage(),"500");
        }
        return result;
    }
}

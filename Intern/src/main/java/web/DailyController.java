package web;

import dto.CommonResult;
import dto.ListResult;
import entity.DailyEntity;
import entity.ExamEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.DailyService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-23.
 */
@Controller
@RequestMapping("/daily")
public class DailyController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DailyService dailyService;

    @RequestMapping(value = "/addRecord",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CommonResult addRecord(@RequestBody DailyEntity daily){
        CommonResult result;
        try {
            int i = dailyService.addRecord(daily);
            if (i > 0)
                result = new CommonResult(true, "提交成功");
            else
                result = new CommonResult(false, "500", "未知错误,找糊七七");

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            result = new CommonResult(false,"500",e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<DailyEntity> getList(@RequestBody DailyEntity daily){
        ListResult<DailyEntity> result;
        try{
            List<DailyEntity> dailyList = dailyService.queryById(daily.getSid());
            result = new ListResult<DailyEntity>(true,dailyList,"200");
        }catch (Exception e){
            logger.error(e.getMessage());
            result = new ListResult<DailyEntity>(false,e.getMessage(),"500");
        }
        return result;
    }

}

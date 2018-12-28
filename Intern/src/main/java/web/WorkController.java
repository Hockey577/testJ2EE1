package web;

import dto.CommonResult;
import entity.WorkEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.WorkService;

/**
 * Created by Administrator on 2017-9-19.
 */
@Controller
@RequestMapping("/work")
public class WorkController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WorkService workService;

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CommonResult addRecord(@RequestBody WorkEntity work){
        CommonResult result;
        try {
            int i = workService.addRecord(work);
            if (i > 0)
                result = new CommonResult(true, "打卡成功");
            else
                result = new CommonResult(false, "500", "未知错误,找糊七七");

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            result = new CommonResult(false,"500",e.getMessage());
        }
        return result;
    }
}

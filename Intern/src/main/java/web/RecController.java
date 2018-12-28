package web;

import dto.CommonResult;
import dto.ListResult;
import entity.ExamEntity;
import entity.RecEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RecService;

import java.util.List;

/**
 * Created by Administrator on 2017-11-2.
 */
@Controller
@RequestMapping("/rec")
public class RecController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RecService recService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<RecEntity> getList() {
        ListResult<RecEntity> result;
        try {
            List<RecEntity> list = recService.queryAll();
            result = new ListResult<RecEntity>(true, list, "200");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result = new ListResult<RecEntity>(false, e.getMessage(), "500");
        }
        return result;
    }

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CommonResult addRecord(@RequestBody RecEntity resource) {
        CommonResult result;
        try {
            int i = recService.addRecord(resource);
            if (i > 0)
                result = new CommonResult(true, "提交成功");
            else
                result = new CommonResult(false, "500", "未知错误,找糊七七");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result = new CommonResult(false, "500", e.getMessage());
        }
        return result;
    }
}

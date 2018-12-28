package web;

import dto.CommonResult;
import dto.ListResult;
import entity.FeedbackEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FeedbackService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-25.
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CommonResult addRecord(@RequestBody FeedbackEntity feedback) {
        CommonResult result;
        try {
            int i = feedbackService.addRecord(feedback);
            if (i > 0)
                result = new CommonResult(true, "提交成功");
            else
                result = new CommonResult(false, "500", "出现错误,找糊七七");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result = new CommonResult(false, "500", e.getMessage());
        }
        return result;
    }

    //返回学生收到的反馈
    @RequestMapping(value = "/queryStu", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<FeedbackEntity> queryStu(@RequestBody FeedbackEntity feedback){
        ListResult<FeedbackEntity> result;
        try{
            List<FeedbackEntity> list = feedbackService.queryStu(feedback.getSperson());
            result = new ListResult<FeedbackEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage());
            result = new ListResult<FeedbackEntity>(false,e.getMessage(),"500");
        }
        return result;
    }

    //返回企业收到的反馈
    @RequestMapping(value = "/queryCom", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<FeedbackEntity> queryCom(@RequestBody FeedbackEntity feedback){
        ListResult<FeedbackEntity> result;
        try{
            List<FeedbackEntity> list = feedbackService.queryCom(feedback.getSperson());
            result = new ListResult<FeedbackEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage());
            result = new ListResult<FeedbackEntity>(false,e.getMessage(),"500");
        }
        return result;
    }

    //返回老师收到的反馈（来自学生）
    @RequestMapping(value = "/queryS2Tea", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<FeedbackEntity> queryS2Tea(@RequestBody FeedbackEntity feedback){
        ListResult<FeedbackEntity> result;
        try{
            List<FeedbackEntity> list = feedbackService.queryS2Tea(feedback.getSperson());
            result = new ListResult<FeedbackEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage());
            result = new ListResult<FeedbackEntity>(false,e.getMessage(),"500");
        }
        return result;
    }

    //返回老师收到的反馈（来自企业）
    @RequestMapping(value = "/queryC2Tea", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ListResult<FeedbackEntity> queryC2Tea(@RequestBody FeedbackEntity feedback){
        ListResult<FeedbackEntity> result;
        try{
            List<FeedbackEntity> list = feedbackService.queryC2Tea(feedback.getSperson());
            result = new ListResult<FeedbackEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage());
            result = new ListResult<FeedbackEntity>(false,e.getMessage(),"500");
        }
        return result;
    }
}

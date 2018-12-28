package web;

import dto.CommonResult;
import dto.ListResult;
import dto.ObjectResult;
import entity.ExamEntity;
import entity.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ExamService;

import java.util.List;

/**
 * Created by Administrator on 2017-9-1.
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ObjectResult getList(@RequestBody StudentEntity student){
        ObjectResult result;
        try {
            ExamEntity examEntity = examService.getExamResult(student.getSid());
            result = new ObjectResult(true,"200",examEntity);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result = new ObjectResult(false,"500",e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/addRecord",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CommonResult addRecord(@RequestBody ExamEntity exam){
        CommonResult result;
        try {
            ExamEntity entity = examService.getExamResult(exam.getSid());
            if (entity == null) {
                int i = examService.addRecord(exam);
                if (i > 0)
                    result = new CommonResult(true, "提交成功");
                else
                    result = new CommonResult(false, "500", "未知错误,找糊七七");
            }
            else{
                int i = examService.modifyRecord(exam);
                if (i > 0)
                    result = new CommonResult(true,"修改成功");
                else
                    result = new CommonResult(false,"500","未知错误,找糊七七");
            }

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            result = new CommonResult(false,"500",e.getMessage());
        }
        return result;
    }
}

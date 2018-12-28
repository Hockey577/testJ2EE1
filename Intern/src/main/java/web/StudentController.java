package web;

import dto.CommonResult;
import dto.ListResult;
import dto.ObjectResult;
import entity.CompanyEntity;
import entity.StudentEntity;
import io.rong.RongCloud;
import io.rong.models.TokenResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

import java.io.Reader;
import java.util.List;

/**
 * Created by Administrator on 2017-8-24.
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    //登录
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public ObjectResult checkLogin(@RequestBody StudentEntity student){
        ObjectResult result;
        String appKey = "x18ywvqfxnyuc";//替换成您的appkey
        String appSecret = "G6cQoPNUwR";//替换成匹配上面key的secret
        student = studentService.checkLogin(student.getSid(),student.getSpassword(),student.getSschool());
        if (student != null) {
            try {
                Reader reader = null;
                RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);
                TokenResult userGetTokenResult = rongCloud.user.getToken(student.getSid()+"",student.getSname(),student.getShead());
                if (userGetTokenResult != null) {
                    long sid = Long.valueOf(userGetTokenResult.getUserId());
                    int i = studentService.saveToken(userGetTokenResult.getToken(),sid);
                    student.setStoken(userGetTokenResult.getToken());
                    result = new ObjectResult(true, "登录成功", student);
                }
                else
                    result = new ObjectResult(false,"500","未知错误，找糊七七");
            }catch (Exception e) {
                logger.error(e.getMessage(), e);
                result = new ObjectResult(false, "500", e.getMessage());
            }
        }
        else
            result = new ObjectResult(false,"500","登录失败");
        return result;
    }

    @RequestMapping(value = "/getTelList",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public ListResult getTelList(@RequestBody StudentEntity student){
        ListResult<Object> result;
        try {
            List<Object> list = studentService.getTelList(student.getSid());
            result = new ListResult<Object>(true,list,"200");

        }catch (Exception e){
            logger.error(e.getMessage(), e);
            result = new ListResult<Object>(false, e.getMessage(), "500");
        }
        return result;
    }

    @RequestMapping(value = "/modifyPwd",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public CommonResult modifyPwd(@RequestBody StudentEntity student){
        CommonResult result;
        try {
            int i = studentService.modifyPwd(student.getSphone(),student.getScode(),student.getSpassword());
            if (i > 0)
                result = new CommonResult(true, "修改成功");

            else if (i == -1)
                result = new CommonResult(false,"验证码不匹配");
            else
                result = new CommonResult(false,"修改失败",null);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            result = new CommonResult(false,"500",e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public ListResult<StudentEntity> queryAll(){
        ListResult<StudentEntity> result;
        try {
            List<StudentEntity> list = studentService.queryAll();
            result = new ListResult<StudentEntity>(true,list,"200");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            result = new ListResult<StudentEntity>(false, e.getMessage(), "500");
        }
        return result;
    }
}

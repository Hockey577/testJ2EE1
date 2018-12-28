package web;

import dto.CommonResult;
import dto.ObjectResult;
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

/**
 * Created by Administrator on 2017-9-25.
 */
@Controller
@RequestMapping("/common")
public class ChatController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    /**
     *  userId:用户 Id，最大长度 64 字节.是用户在 App 中的唯一标识码，必须保证在同一个 App 内不重复，重复的用户 Id 将被当作是同一用户。（必传）
     *  name:用户名称，最大长度 128 字节.用来在 Push 推送时显示用户的名称.用户名称，最大长度 128 字节.用来在 Push 推送时显示用户的名称。（必传）
     *  portraitUri:用户头像 URI，最大长度 1024 字节.用来在 Push 推送时显示用户的头像。（必传）
     **/
    @RequestMapping(value = "/getToken",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public ObjectResult getToken(@RequestBody StudentEntity stu){
        ObjectResult result;
        String appKey = "x18ywvqfxnyuc";//替换成您的appkey
        String appSecret = "G6cQoPNUwR";//替换成匹配上面key的secret
        try {
            Reader reader = null;
            RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);
            TokenResult userGetTokenResult = rongCloud.user.getToken(stu.getSid()+"",stu.getSname(),stu.getShead());
            System.out.println("getToken:  " + userGetTokenResult.toString());
            if (userGetTokenResult != null) {
                result = new ObjectResult(true, "200", userGetTokenResult);
                long sid = Long.valueOf(userGetTokenResult.getUserId());
                int i = studentService.saveToken(userGetTokenResult.getToken(),sid);
            }
            else
                result = new ObjectResult(false,"500","未知错误，找糊七七");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            result = new ObjectResult(false,"500",e.getMessage());
        }
        return result;
    }

}

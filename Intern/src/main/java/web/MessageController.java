package web;

import java.util.Date;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import java.text.SimpleDateFormat;
import java.util.Random;

import dto.CommonResult;
import dto.ListResult;
import dto.StringResult;
import entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

import static util.SmsUtil.querySendDetails;
import static util.SmsUtil.sendSms;


/**
 * 短信验证---阿里大于工具
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    static final Integer NUM=6;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/send",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public StringResult sendMessage(@RequestBody StudentEntity student) throws ClientException, InterruptedException{
        //生成验证码：
        String smsCode="";
        Random r = new Random(new Date().getTime());
        for(int i=0;i<NUM;i++){
            smsCode = smsCode+ r.nextInt(10);
        }
        long phoneNum = Long.valueOf(student.getSphone());
        SendSmsResponse response = sendSms(phoneNum,smsCode);
        if (response.getCode().equals("OK")) {
            int i = studentService.saveCode(student.getSid(), smsCode,student.getSphone());
            return new StringResult(true, response.getMessage(), "验证码：" + smsCode);
        }
        else
            return new StringResult(false,response.getMessage(),response.getCode());
    }

//    public static void main(String[] args) throws ClientException, InterruptedException {
//
//        //发短信
//        SendSmsResponse response = sendSms(15869191710L,"123456");
//        System.out.println("短信接口返回的数据----------------");
//        System.out.println("Code=" + response.getCode());
//        System.out.println("Message=" + response.getMessage());
//        System.out.println("RequestId=" + response.getRequestId());
//        System.out.println("BizId=" + response.getBizId());
//
//        Thread.sleep(3000L);
//
//        //查明细
//        if (response.getCode() != null && response.getCode().equals("OK")) {
//            QuerySendDetailsResponse querySendDetailsResponse = querySendDetails(response.getBizId());
//            System.out.println("短信明细查询接口返回数据----------------");
//            System.out.println("Code=" + querySendDetailsResponse.getCode());
//            System.out.println("Message=" + querySendDetailsResponse.getMessage());
//            int i = 0;
//            for (QuerySendDetailsResponse.SmsSendDetailDTO smsSendDetailDTO : querySendDetailsResponse.getSmsSendDetailDTOs()) {
//                System.out.println("SmsSendDetailDTO[" + i + "]:");
//                System.out.println("Content=" + smsSendDetailDTO.getContent());
//                System.out.println("ErrCode=" + smsSendDetailDTO.getErrCode());
//                System.out.println("OutId=" + smsSendDetailDTO.getOutId());
//                System.out.println("PhoneNum=" + smsSendDetailDTO.getPhoneNum());
//                System.out.println("ReceiveDate=" + smsSendDetailDTO.getReceiveDate());
//                System.out.println("SendDate=" + smsSendDetailDTO.getSendDate());
//                System.out.println("SendStatus=" + smsSendDetailDTO.getSendStatus());
//                System.out.println("Template=" + smsSendDetailDTO.getTemplateCode());
//            }
//            System.out.println("TotalCount=" + querySendDetailsResponse.getTotalCount());
//            System.out.println("RequestId=" + querySendDetailsResponse.getRequestId());
//        }
//    }
}
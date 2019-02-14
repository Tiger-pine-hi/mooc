package com.wjs.mooc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component
public class Tools {

    @Autowired
    private static JsonMsg jsonMsg;

    /**
     * MD5算法
     * @param str
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String getMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    /**
     * 获取全局通用唯一识别码
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String getUUID()throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,16);
        return uuid;
    }

    /**
     * 获取当前时间
     * @return
     * @throws Exception
     */
    public static String getTime()throws Exception{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");//设置日期格式
        String Time = dateFormat.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        return Time;
    }

    /**
     * 校验验证码
     * @param client
     * @param server
     * @return
     */
    public static JsonMsg checkVerifyCode(String client ,String server){
        client = client.toUpperCase();
        if(!client.equals(server)){
            jsonMsg = JsonMsg.fail();
            jsonMsg.setMsg("验证码错误");
        }else{
            jsonMsg = JsonMsg.success();
            jsonMsg.setMsg("验证码正确");
        }
        return jsonMsg;
    }

}

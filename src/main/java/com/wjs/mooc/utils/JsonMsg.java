package com.wjs.mooc.utils;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JsonMsg {

    //状态码：0--成功  1--失败
    private int code;
    //提示信息
    private String msg;
    //token
    private String token;
    //用户要返回给浏览器的数据
    private Map<String, Object> extendInfo = new HashMap<String, Object>();

    /**
     * 返回成功操作提示
     * @return
     */
    public static JsonMsg success(){
        JsonMsg res = new JsonMsg();
        res.setCode(0);
        return res;
    }

    /**
     * 返回失败操作提示
     * @return
     */
    public static JsonMsg fail(){
        JsonMsg res = new JsonMsg();
        res.setCode(1);
        return res;
    }

    /**
     * //添加键值对对象
     * @param key
     * @param value
     * @return
     */
    public JsonMsg addInfo(String key, Object value){
        this.extendInfo.put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, Object> extendInfo) {
        this.extendInfo = extendInfo;
    }



}

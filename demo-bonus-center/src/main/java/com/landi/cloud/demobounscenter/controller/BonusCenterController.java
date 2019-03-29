package com.landi.cloud.demobounscenter.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.landi.cloud.demobounscenter.feign.UserCenterFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: linqj
 * @Date: 2019/3/28 16:04
 */
@RestController
public class BonusCenterController {

    @Autowired
    private UserCenterFeignClient userCenterFeignClient;

    @GetMapping("/test")
    public Object test() {
        return userCenterFeignClient.me();
    }

    @GetMapping("/sign")
    public Object sing() {
        Object before = doBefore();
        if(before != null) {
            return before;
        }

        Object object = userCenterFeignClient.me();
        JSONObject content = JSONObject.parseObject(JSONObject.toJSONString(object));
        JSONObject user = content.getJSONObject("data");
        int bonus  = user.getInteger("bonus")+1;
        user.remove("bonus");
        user.put("bonus", bonus);
        JSONObject result = new JSONObject();
        result.put("status",200);
        result.put("data",user);
        userCenterFeignClient.addBonus();
        return result;
    }

    @GetMapping("/forward")
    public void forward() {
        System.out.println("用户转发了内容");
    }

    @GetMapping("/bonus-logs")
    public Object logs() {
        Object before = doBefore();
        if(before != null) {
            return before;
        }
        String s = "[\n" +
                "\t{\n" +
                "\t\t\"event\": \"BUY\",\n" +
                "\t\t\"value\": 10,\n" +
                "\t\t\"createTime\": \"2019-3-28 10:12:00\",\n" +
                "\t\t\"description\": \"this is a describe\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"event\": \"CONTRIBUTE\",\n" +
                "\t\t\"value\": 10,\n" +
                "\t\t\"createTime\": \"2019-3-28 10:12:00\",\n" +
                "\t\t\"description\": \"this is a describe\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"event\": \"SIGN\",\n" +
                "\t\t\"value\": 10,\n" +
                "\t\t\"createTime\": \"2019-3-28 10:12:00\",\n" +
                "\t\t\"description\": \"this is a describe\"\n" +
                "\t}\n" +
                "]\n";
        JSONArray array = JSONArray.parseArray(s);
        JSONObject result = new JSONObject();
        result.put("status",200);
        result.put("data", array);
        return result;
    }

    private Object doBefore() {
        String s = "\n" +
                "{\"status\": 1, \"msg\": \"please login before\", \"data\": null}";
        // 获取用户信息
        Object result = userCenterFeignClient.me();
        System.out.println(JSONObject.toJSONString(result));
        JSONObject object = JSONObject.parseObject(JSONObject.toJSONString(result));
        if(object.getInteger("status") != 200) {
            return JSONObject.parseObject(s);
        }
        return null;
    }
}

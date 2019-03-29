package com.landi.cloud.demousercenter.controller;

import com.alibaba.fastjson.JSONObject;
import com.landi.cloud.demousercenter.Token;
import com.landi.cloud.demousercenter.User;
import com.landi.cloud.demousercenter.UserCache;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: linqj
 * @Date: 2019/3/28 14:42
 */
@RestController
public class UserCenterController {

    @RequestMapping(value = "/login/miniapp", method = RequestMethod.POST)
    @ResponseBody
    public Object miniapp(@RequestBody String request) {
        System.out.println(request);
        try {
            JSONObject object = JSONObject.parseObject(request);
            String code = object.getString("code");
            String nickname = object.getString("wxNickname");
            String avatarUrl = object.getString("avatarUrl");
            User user = new User();
            user.setNickname(nickname);
            user.setAvatarUrl(avatarUrl);
            user.setBonus(0);
            Token token = new Token();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.SECOND,7200000);
            System.out.println(calendar.getTimeInMillis());
            token.setExpirationTime(calendar.getTimeInMillis());
            token.setToken("token");
            JSONObject result = new JSONObject();
            result.put("token", token);
            result.put("user", user);
            JSONObject data = new JSONObject();
            data.put("status", 200);
            data.put("data", result);
            UserCache.user = user;
            System.out.println("用户登录成功:" + user);
            return data;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/me")
    @ResponseBody
    public Object me() {
        if(UserCache.user == null) {
            String s = "\n" +
                    "{status: 1, msg: \"please login before\", data: null}";
            String result =  JSONObject.parseObject(s).toJSONString();
            return JSONObject.parseObject(result);
        }
        if (UserCache.user != null) {
            JSONObject object = new JSONObject();
            object.put("status",200);
            object.put("data", UserCache.user);
            return object;
        }
        return JSONObject.parseObject("{\"status\":201}");
    }

    @PutMapping("/user/bonus")
    public void user() {
        UserCache.user.addBouns();
    }


}

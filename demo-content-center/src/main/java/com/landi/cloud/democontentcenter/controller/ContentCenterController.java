package com.landi.cloud.democontentcenter.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.landi.cloud.democontentcenter.feign.UserCenterFeignClient;
import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: linqj
 * @Date: 2019/3/28 13:50
 */
@RestController
@CrossOrigin
public class ContentCenterController {

    private Map<Integer, Object> shareds = new HashMap<>();

    private int no = 1;

    @Autowired
    private UserCenterFeignClient userCenterFeignClient;

    @GetMapping("/notices/newest")
    @ResponseBody
    public Object newest() {
        String s = "{\n" +
                " \"id\": \"5c1144f927b00d372037af8a\",\n" +
                " \"content\": \"this is a test demo\",\n" +
                " \"show\": true,\n" +
                " \"createTime\": \"2019-03-28 01:27:21\"\n" +
                "}";
        JSONObject object = JSONObject.parseObject(s);
        JSONObject result = new JSONObject();
        result.put("status", 200);
        result.put("data", object);
        return result;
    }

    @GetMapping("/posts/shares/q")
    @ResponseBody
    public Object shares() {
        String s = "{\n" +
                "\t\"content\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"5c96f67627b00df60217a99d\",\n" +
                "\t\t\t\"userId\": \"5c11413127b00d372037af83\",\n" +
                "\t\t\t\"title\": \"Kubernetes开源书\",\n" +
                "\t\t\t\"createTime\": \"2019-03-24 11:16:06\",\n" +
                "\t\t\t\"updateTime\": \"2019-03-24 11:16:06\",\n" +
                "\t\t\t\"type\": \"share\",\n" +
                "\t\t\t\"isOriginal\": true,\n" +
                "\t\t\t\"author\": \"周立\",\n" +
                "\t\t\t\"cover\": \"imgs/cover.jpeg\",\n" +
                "\t\t\t\"summary\": \"Kubernetes开源书，系统学习Kubernetes！\",\n" +
                "\t\t\t\"price\": 0,\n" +
                "\t\t\t\"buyCount\": 49,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"auditStatus\": \"PASS\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"5c96f65827b00df60217a99c\",\n" +
                "\t\t\t\"userId\": \"5c11413127b00d372037af83\",\n" +
                "\t\t\t\"title\": \"Docker开源书\",\n" +
                "\t\t\t\"createTime\": \"2019-03-24 11:15:36\",\n" +
                "\t\t\t\"updateTime\": \"2019-03-24 11:15:36\",\n" +
                "\t\t\t\"type\": \"share\",\n" +
                "\t\t\t\"isOriginal\": true,\n" +
                "\t\t\t\"author\": \"周立\",\n" +
                "\t\t\t\"cover\": \"imgs/cover.jpeg\",\n" +
                "\t\t\t\"summary\": \"Docker开源书，涵盖Docker常用命令、Dockerfile常用命令、网络、存储、Docker Compose等常见知识点，知识体系比较完备。\",\n" +
                "\t\t\t\"price\": 0,\n" +
                "\t\t\t\"buyCount\": 47,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"auditStatus\": \"PASS\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"pageable\": {\n" +
                "\t\t\"sort\": {\n" +
                "\t\t\t\"unsorted\": false,\n" +
                "\t\t\t\"sorted\": true,\n" +
                "\t\t\t\"empty\": false\n" +
                "\t\t},\n" +
                "\t\t\"pageSize\": 10,\n" +
                "\t\t\"pageNumber\": 0,\n" +
                "\t\t\"offset\": 0,\n" +
                "\t\t\"paged\": true,\n" +
                "\t\t\"unpaged\": false\n" +
                "\t},\n" +
                "\t\"totalPages\": 3,\n" +
                "\t\"totalElements\": 24,\n" +
                "\t\"last\": false,\n" +
                "\t\"first\": true,\n" +
                "\t\"sort\": {\n" +
                "\t\t\"unsorted\": false,\n" +
                "\t\t\"sorted\": true,\n" +
                "\t\t\"empty\": false\n" +
                "\t},\n" +
                "\t\"numberOfElements\": 10,\n" +
                "\t\"size\": 10,\n" +
                "\t\"number\": 0,\n" +
                "\t\"empty\": false\n" +
                "}";
        JSONObject object = JSONObject.parseObject(s);
        JSONObject result = new JSONObject();
        result.put("status", 200);
        result.put("data", object);
        return result;
    }

    @GetMapping("/posts/shares/user")
    @ResponseBody
    public Object sharesUser() {
        String s = "{\n" +
                "\t\"content\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"5c96f67627b00df60217a99d\",\n" +
                "\t\t\t\"userId\": \"5c11413127b00d372037af83\",\n" +
                "\t\t\t\"title\": \"Kubernetes开源书\",\n" +
                "\t\t\t\"createTime\": \"2019-03-24 11:16:06\",\n" +
                "\t\t\t\"updateTime\": \"2019-03-24 11:16:06\",\n" +
                "\t\t\t\"type\": \"share\",\n" +
                "\t\t\t\"isOriginal\": true,\n" +
                "\t\t\t\"author\": \"周立\",\n" +
                "\t\t\t\"cover\": \"imgs/cover.jpeg\",\n" +
                "\t\t\t\"summary\": \"Kubernetes开源书，系统学习Kubernetes！\",\n" +
                "\t\t\t\"price\": 0,\n" +
                "\t\t\t\"buyCount\": 49,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"auditStatus\": \"PASS\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"5c96f65827b00df60217a99c\",\n" +
                "\t\t\t\"userId\": \"5c11413127b00d372037af83\",\n" +
                "\t\t\t\"title\": \"Docker开源书\",\n" +
                "\t\t\t\"createTime\": \"2019-03-24 11:15:36\",\n" +
                "\t\t\t\"updateTime\": \"2019-03-24 11:15:36\",\n" +
                "\t\t\t\"type\": \"share\",\n" +
                "\t\t\t\"isOriginal\": true,\n" +
                "\t\t\t\"author\": \"周立\",\n" +
                "\t\t\t\"cover\": \"imgs/cover.jpeg\",\n" +
                "\t\t\t\"summary\": \"Docker开源书，涵盖Docker常用命令、Dockerfile常用命令、网络、存储、Docker Compose等常见知识点，知识体系比较完备。\",\n" +
                "\t\t\t\"price\": 0,\n" +
                "\t\t\t\"buyCount\": 47,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"auditStatus\": \"PASS\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"pageable\": {\n" +
                "\t\t\"sort\": {\n" +
                "\t\t\t\"unsorted\": false,\n" +
                "\t\t\t\"sorted\": true,\n" +
                "\t\t\t\"empty\": false\n" +
                "\t\t},\n" +
                "\t\t\"pageSize\": 10,\n" +
                "\t\t\"pageNumber\": 0,\n" +
                "\t\t\"offset\": 0,\n" +
                "\t\t\"paged\": true,\n" +
                "\t\t\"unpaged\": false\n" +
                "\t},\n" +
                "\t\"totalPages\": 3,\n" +
                "\t\"totalElements\": 24,\n" +
                "\t\"last\": false,\n" +
                "\t\"first\": true,\n" +
                "\t\"sort\": {\n" +
                "\t\t\"unsorted\": false,\n" +
                "\t\t\"sorted\": true,\n" +
                "\t\t\"empty\": false\n" +
                "\t},\n" +
                "\t\"numberOfElements\": 10,\n" +
                "\t\"size\": 10,\n" +
                "\t\"number\": 0,\n" +
                "\t\"empty\": false\n" +
                "}";
        JSONObject object = JSONObject.parseObject(s);
        JSONObject result = new JSONObject();
        result.put("status", 200);
        result.put("data", object);
        return result;
    }

    @PostMapping("/contribute")
    public Object contribute(@RequestBody Object content) {

        Object before = doBefore();
        if(before != null) {
            return before;
        }
        JSONObject object = new JSONObject();
        JSONObject jsonContent = JSONObject.parseObject(JSONObject.toJSONString(content));
        System.out.println("提交的稿件:"+JSONObject.toJSONString(content));
        shareds.put(no, jsonContent);
        JSONObject object1 = new JSONObject();
        object1.put("id",no);
        no++;
        object.put("status", 200);
        object.put("data", object1);
        return object;
    }

    @GetMapping("/contributions")
    public Object contributes() {

        JSONObject object = new JSONObject();
        object.put("status",200);
        JSONArray arrays = new JSONArray();
        Set<Map.Entry<Integer, Object>> contributes = shareds.entrySet();
        for(Map.Entry<Integer,Object> contribute: contributes) {
            JSONObject con = new JSONObject();
            con.put("auditStatus", "NOT_YET");
            String value = contribute.getValue().toString();
            con.put("title", JSONObject.parseObject(value).getString("title"));
            con.put("reason","测试原因");
            arrays.add(con);
        }
        System.out.println(arrays.toJSONString());
        object.put("data", arrays);
        return object;
    }

    @GetMapping("/preview/{id}")
    public Object preview(@PathVariable(value = "id") Integer id) {
        JSONObject object = new JSONObject();
        JSONObject shared = (JSONObject) shareds.get(id);
        System.out.println(shareds);
        shared.put("buyCount",10);
        object.put("data",shared);
        object.put("status", 200);
        return object;
    }

    private Object doBefore() {
        String s = "\n" +
                "{\"status\": 1, \"msg\": \"please login before\", \"data\": null}";
        // 获取用户信息
        Object result = userCenterFeignClient.me();
        JSONObject object = JSONObject.parseObject(JSONObject.toJSONString(result));
        if(object.getInteger("status") != 200) {
            return JSONObject.parseObject(s);
        }
        return null;
    }
}

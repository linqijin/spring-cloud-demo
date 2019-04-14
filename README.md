版本太低，用的Edgware，已经快停止维护了。建议实际项目用Finchley以及Greenwich。



示例：

```
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
```

这里都是自己去序列化/反序列化了。不建议这么搞，代码太难读了。

建议尽量返回合适对象(实体/DTO)，让框架给你自动序列化/反序列化，提升代码可读性。代码还有其他几处，存在字符串拼接，然后自己转JSON对象的场景。

个人建议：

慎用JSONObject/Map，因为太灵活了，不仔细看代码根本不知道里面放的是什么。这对项目后期维护不利。
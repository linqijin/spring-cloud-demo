package com.landi.cloud.demobounscenter.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @Author: linqj
 * @Date: 2019/3/28 14:03
 */
@FeignClient(name = "demo-user-center")
public interface UserCenterFeignClient {
    @GetMapping("/me")
    Object me();

    @PutMapping("/user/bonus")
    void addBonus();
}

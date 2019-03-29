package com.landi.cloud.democontentcenter.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: linqj
 * @Date: 2019/3/28 14:03
 */
@FeignClient(name = "demo-user-center")
public interface UserCenterFeignClient {
    @GetMapping("/me")
    Object me();
}

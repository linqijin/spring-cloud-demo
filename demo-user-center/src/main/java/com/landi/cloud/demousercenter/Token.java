package com.landi.cloud.demousercenter;

/**
 * @Author: linqj
 * @Date: 2019/3/28 14:53
 */
public class Token {

    private Long expirationTime;
    private String token;

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

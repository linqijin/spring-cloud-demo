package com.landi.cloud.zuulserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: linqj
 * @Date: 2019/3/28 14:22
 */
public class LoginZuulFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String uri = request.getRequestURI();
        System.out.println(uri);
        if(uri.contains("/notices/newest") || uri.contains("/posts/shares") || uri.contains("login/miniapp")) {
            return false;
        }
        return false;
    }

    @Override
    public Object run() {
        String s = "\n" +
                "{status: 1, msg: \"please login before\", data: null}";
        RequestContext ctx = RequestContext.getCurrentContext();
        // 获取用户信息
        Object result = new RestTemplate().getForObject("http://172.20.8.16:5566/user-center/me", String.class);
        if(result  == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody(s);
        }
        return null;
    }
}

package com.landi.cloud.zuulserver;

/**
 * keycloak传播header的filter。
 * 参考：https://github.com/Activiti/activiti-cloud-gateway/blob/master/src/main/java/org/activiti/cloud/gateway/KeycloakFilterRoute.java
 */
//@Component
public class KeycloakRouteZuulFilter /*extends ZuulFilter*/ {

//    private static final String AUTHORIZATION_HEADER = "Authorization";
//
//    @Override
//    public String filterType() {
//        return FilterConstants.ROUTE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        Principal principal = request.getUserPrincipal();
//        return principal != null && principal instanceof KeycloakPrincipal;
//    }
//
//    @Override
//    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        if (ctx.getRequest().getHeader(AUTHORIZATION_HEADER) == null) {
//            this.addKeycloakTokenToHeader(ctx);
//        }
//        return null;
//    }
//
//    private void addKeycloakTokenToHeader(RequestContext ctx) {
//        Principal principal = ctx.getRequest()
//                .getUserPrincipal();
//
//        // 这里之所以可以直接强制转换，是因为shouldFilter中已经做了类型判断。
//        KeycloakSecurityContext keycloakSecurityContext = ((KeycloakPrincipal) principal)
//                .getKeycloakSecurityContext();
//
//        if (keycloakSecurityContext instanceof RefreshableKeycloakSecurityContext) {
//            ctx.addZuulRequestHeader(AUTHORIZATION_HEADER,
//                    this.buildBearerToken(
//                            (RefreshableKeycloakSecurityContext) keycloakSecurityContext
//                    )
//            );
//        }
//        // 用户没有登录，啥都不干
//    }
//
//    private String buildBearerToken(RefreshableKeycloakSecurityContext securityContext) {
//        return "Bearer " + securityContext.getTokenString();
//    }
}
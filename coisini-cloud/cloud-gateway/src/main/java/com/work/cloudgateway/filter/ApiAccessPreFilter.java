package com.work.cloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class ApiAccessPreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //前置过滤器
        return "pre";
    }

    @Override
    public int filterOrder() {
        //优先级，数字越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否执行该过滤器，true代表需要过滤
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletRequest httpRequest = ctx.getRequest();
        final String method = httpRequest.getMethod();

        // 在跨域请求中，会先发送一次IPTIONS请求，来判断是否安全
        if (method.equals(HttpMethod.OPTIONS.toString())) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        }

        //对请求进行路由
        ctx.setSendZuulResponse(true);
        ctx.setResponseStatusCode(200);
        ctx.set("isSuccess", true);
        return null;
    }

}

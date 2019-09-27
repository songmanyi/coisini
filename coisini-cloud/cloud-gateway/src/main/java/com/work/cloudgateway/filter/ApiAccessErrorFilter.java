package com.work.cloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
public class ApiAccessErrorFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //异常过滤器
        return "error";
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

        log.debug(String.format("[IN][%s] %s", "Zuul Filter Error"));

        System.out.println(ctx.getResponseBody());

        log.debug(String.format("[OUT][%s] %s", "Zuul Filter Error"));

        return null;
    }
}

package com.work.cloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ApiAccessPostFilter extends ZuulFilter{
    private static Logger logger = LoggerFactory.getLogger(ApiAccessPostFilter.class);

    @Override
    public String filterType() {
        //后置过滤器
        return "post";
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
        logger.debug(String.format("[IN]"));
        return null;

    }
}

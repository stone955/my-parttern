package com.stone.parttern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogProxyHandler implements InvocationHandler {

    private Object target;

    public LogProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("LogProxyHandler.serve begin");
        Object result = method.invoke(target, args);
        System.out.println("LogProxyHandler.serve end");
        return result;
    }
}

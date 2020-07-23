package com.stone.parttern.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MetricProxyHandler implements InvocationHandler {

    private Object target;

    public MetricProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.printf("MetricHandler.serve= %dms.\n", end - begin);
        return result;
    }

}

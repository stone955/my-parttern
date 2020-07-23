package com.stone.parttern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // 代理原接口
       Handler handler = new HttpHandler();
        Handler metricProxy = (Handler) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(),
                handler.getClass().getInterfaces(),
                new MetricProxyHandler(handler));

        metricProxy.serve();

        // 代理的代理
        Handler logProxy = (Handler) Proxy.newProxyInstance(
                metricProxy.getClass().getClassLoader(),
                metricProxy.getClass().getInterfaces(),
                new LogProxyHandler(metricProxy));
        logProxy.serve();
    }

}

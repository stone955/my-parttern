package com.stone.parttern.proxy.staticproxy;

public class Main {

    public static void main(String[] args) {
        // 没有代理
        Handler handler = new HttpHandler();
        handler.serve();
        System.out.println();

        // 增加耗时统计代理
        handler = new MetricProxyHandler(handler);
        handler.serve();
        System.out.println();

        // 增加日志代理
        handler = new LogProxyHandler(handler);
        handler.serve();
        System.out.println();
    }

}

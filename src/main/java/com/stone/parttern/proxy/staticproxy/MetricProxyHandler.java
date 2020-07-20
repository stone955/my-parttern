package com.stone.parttern.proxy.staticproxy;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class MetricProxyHandler implements Handler {

    private Handler handler;

    public MetricProxyHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void serve() {
        long begin = System.currentTimeMillis();
        this.handler.serve();
        long end = System.currentTimeMillis();
        System.out.printf("MetricHandler.serve= %dms.\n", end - begin);
    }


}

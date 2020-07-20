package com.stone.parttern.proxy.staticproxy;

public class LogProxyHandler implements Handler {

    private Handler handler;

    public LogProxyHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void serve() {
        System.out.println("LogProxyHandler.serve begin");
        this.handler.serve();
        System.out.println("LogProxyHandler.serve end");
    }
}

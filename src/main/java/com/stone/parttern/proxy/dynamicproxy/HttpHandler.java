package com.stone.parttern.proxy.dynamicproxy;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HttpHandler implements Handler {
    @Override
    public void serve() {
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10 * 1000));
            System.out.println("HttpHandler.serve");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

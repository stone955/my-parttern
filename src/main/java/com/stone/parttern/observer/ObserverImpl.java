package com.stone.parttern.observer;

public class ObserverImpl implements Observer {

    @Override
    public void onNotify() {
        System.out.println("OnNotify......");
    }
}

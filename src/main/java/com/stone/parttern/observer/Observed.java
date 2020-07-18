package com.stone.parttern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Observed {

    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new ObserverImpl());
    }

    public void fire() {
        for (Observer observer : observers) {
            observer.onNotify();
        }
    }

}

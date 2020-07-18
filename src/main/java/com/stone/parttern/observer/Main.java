package com.stone.parttern.observer;

public class Main {

    public static void main(String[] args) {
        Observed observed = new Observed();
        observed.fire();
    }

}

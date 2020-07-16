package com.stone.parttern.factory.factorymethod;

public class PlaneFactory {

    public Movable create() {
        System.out.println("PlaneFactory create plane");
        return new Plane();
    }

}

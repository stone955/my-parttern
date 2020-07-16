package com.stone.parttern.factory.factorymethod;

public class PlaneFactory implements MovableFactory {

    @Override
    public Movable create() {
        System.out.println("PlaneFactory create plane");
        return new Plane();
    }

}

package com.stone.parttern.factory.factorymethod;

public class CarFactory implements MovableFactory {

    @Override
    public Movable create() {
        System.out.println("CarFactory create car");
        return new Car();
    }

}

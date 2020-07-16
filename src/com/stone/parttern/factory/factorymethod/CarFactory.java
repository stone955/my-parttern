package com.stone.parttern.factory.factorymethod;

public class CarFactory {

    public Movable create() {
        System.out.println("CarFactory create car");
        return new Car();
    }

}

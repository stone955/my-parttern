package com.stone.parttern.factory.factorymethod;

/*
简单工厂：扩展性不好
 */
public class SimpleVehicleFactory {

    public Movable createCar() {
        return new Car();
    }

    public Movable createPlane() {
        return new Plane();
    }

}

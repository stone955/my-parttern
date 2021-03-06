package com.stone.parttern.factory.factorymethod;

public class Main {

    public static void main(String[] args) {
        // 简单工厂创建对象
        SimpleVehicleFactory factory = new SimpleVehicleFactory();
        Movable car = factory.createCar();
        car.go();

        Movable plane = factory.createPlane();
        plane.go();

        // 工厂方法，抽象工厂的特例，只生产一种产品
        MovableFactory carFactory = new CarFactory();
        Movable c = carFactory.create();
        c.go();

        MovableFactory planeFactory = new PlaneFactory();
        Movable p = planeFactory.create();
        p.go();

    }

}

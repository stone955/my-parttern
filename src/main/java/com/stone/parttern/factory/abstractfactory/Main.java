package com.stone.parttern.factory.abstractfactory;

public class Main {

    public static void main(String[] args) {

//        ForceFactory factory = new LandForceFactory();
        ForceFactory factory = new AirForceFactory();

        Movable m = factory.createMovable();
        m.go();

        Shooter s = factory.createShooter();
        s.shoot();
    }

}

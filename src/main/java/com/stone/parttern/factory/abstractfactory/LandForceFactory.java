package com.stone.parttern.factory.abstractfactory;

public class LandForceFactory implements ForceFactory {

    @Override
    public Movable createMovable() {
        return new Car();
    }

    @Override
    public Shooter createShooter() {
        return new B46();
    }
}

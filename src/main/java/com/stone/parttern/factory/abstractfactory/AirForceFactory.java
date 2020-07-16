package com.stone.parttern.factory.abstractfactory;

public class AirForceFactory implements ForceFactory {

    @Override
    public Movable createMovable() {
        return new Plane();
    }

    @Override
    public Shooter createShooter() {
        return new Ak47();
    }
}

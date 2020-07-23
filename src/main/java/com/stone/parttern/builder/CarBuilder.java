package com.stone.parttern.builder;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public Builder withWheel(int with, int aspect, int diameter) {
        car.setWheel(new Wheel(with, aspect, diameter));
        return this;
    }

    @Override
    public Builder withChassis(int length, int with) {
        car.setChassis(new Chassis(length, with));
        return this;
    }

    @Override
    public Builder withTrunk(int volume) {
        car.setTrunk(new Trunk(volume));
        return this;
    }

    @Override
    public Movable build() {
        return car;
    }
}

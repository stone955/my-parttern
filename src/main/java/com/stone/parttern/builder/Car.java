package com.stone.parttern.builder;

public class Car implements Movable {

    private Wheel wheel;

    private Chassis chassis;

    private Trunk trunk;

    @Override
    public void move() {
        System.out.printf("Car move wheel= %s chassis= %s, trunk= %s\n",
                wheel, chassis, trunk);
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }
}

class Wheel {
    private final int with;
    private final int aspect;
    private final int diameter;

    public Wheel(int with, int aspect, int diameter) {
        this.with = with;
        this.aspect = aspect;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "with=" + with +
                ", aspect=" + aspect +
                ", diameter=" + diameter +
                '}';
    }
}

class Chassis {
    private final int length;
    private final int with;

    public Chassis(int length, int with) {
        this.length = length;
        this.with = with;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "length=" + length +
                ", with=" + with +
                '}';
    }
}

class Trunk {
    private final int volume;

    public Trunk(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Trunk{" +
                "volume=" + volume +
                '}';
    }
}

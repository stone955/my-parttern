package com.stone.parttern.builder;

public class Main {

    public static void main(String[] args) {
        Builder carBuilder = new CarBuilder()
                .withWheel(65, 55, 19)
                .withChassis(4, 1)
                .withTrunk(400);

        Movable car = carBuilder.build();
        car.move();
    }

}

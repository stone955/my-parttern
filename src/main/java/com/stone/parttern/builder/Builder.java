package com.stone.parttern.builder;

public interface Builder {

    Builder withWheel(int with, int aspect, int diameter);

    Builder withChassis(int length, int with);

    Builder withTrunk(int volume);

    Movable build();

}

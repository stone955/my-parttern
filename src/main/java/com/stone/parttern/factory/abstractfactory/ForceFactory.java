package com.stone.parttern.factory.abstractfactory;

/**
 * 抽象工厂：扩展产品族方便，扩展产品不方便
 * 例如：换皮肤
 */
public interface ForceFactory {

    Movable createMovable();

    Shooter createShooter();

}

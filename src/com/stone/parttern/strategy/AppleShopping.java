package com.stone.parttern.strategy;

public class AppleShopping implements Shopping<Apple> {

    private Double discount;

    public AppleShopping() {
        this(0.8);
    }

    public AppleShopping(Double discount) {
        this.discount = discount;
    }

    @Override
    public void sell(Apple apple) {
        System.out.printf("AppleShopping name= %s, price= %f \n",
                apple.name,
                apple.price * discount);
    }

}

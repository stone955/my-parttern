package com.stone.parttern.strategy;

public class Apple extends Product {

    public Apple(String name, Double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}

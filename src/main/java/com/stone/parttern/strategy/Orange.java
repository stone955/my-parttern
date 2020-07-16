package com.stone.parttern.strategy;

public class Orange extends Product {

    public Orange(String name, Double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

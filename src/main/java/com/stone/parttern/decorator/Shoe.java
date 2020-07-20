package com.stone.parttern.decorator;

public class Shoe implements Decorator {

    private Decorator decorator;

    public Shoe(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        System.out.println("Shoe.decorate");
        this.decorator.decorate();
    }
}

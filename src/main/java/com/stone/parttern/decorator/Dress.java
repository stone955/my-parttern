package com.stone.parttern.decorator;

public class Dress implements Decorator {

    private Decorator decorator;

    public Dress(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        System.out.println("Dress.decorate");
        this.decorator.decorate();
    }
}

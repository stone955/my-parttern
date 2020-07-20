package com.stone.parttern.decorator;

public class Glasses implements Decorator {

    private Decorator decorator;

    public Glasses(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        System.out.println("Glasses.decorate");
        this.decorator.decorate();
    }
}

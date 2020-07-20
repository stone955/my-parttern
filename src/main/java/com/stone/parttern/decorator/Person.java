package com.stone.parttern.decorator;

public class Person implements Decorator {

    private Decorator decorator;


    public Person(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        System.out.println("Person.decorate");
    }
}

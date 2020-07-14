package com.stone.parttern.strategy;

public class Strategy {

    public static void main(String[] args) {

        Apple apple = new Apple("apple", 5.00);
        Apple apple2 = new Apple("apple2", 10.00);

        Shopping<Apple> appleShopping = new AppleShopping();
        appleShopping.sell(apple);
        appleShopping.sell(apple2);

        Orange orange = new Orange("orange", 5.00);
        Orange orange2 = new Orange("orange2", 20.00);

        Shopping<Orange> orangeShopping = new OrangeShopping();
        orangeShopping.sell(orange);
        orangeShopping.sell(orange2);

    }
}

package com.stone.parttern.strategy;

public class OrangeShopping implements Shopping<Orange> {

    private final Double discount;

    public OrangeShopping() {
        this(5.00);
    }

    public OrangeShopping(Double discount) {
        this.discount = discount;
    }

    @Override
    public void sell(Orange orange) {
        if (orange.price - discount > 0) {
            System.out.printf("OrangeShopping name= %s, price= %f \n",
                    orange.name, orange.price - discount);
        } else {
            System.out.printf("OrangeShopping name= %s, price= %f \n",
                    orange.name, orange.price);
        }

    }

}

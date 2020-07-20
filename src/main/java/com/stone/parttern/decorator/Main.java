package com.stone.parttern.decorator;

public class Main {

    public static void main(String[] args) {

        // 一个人什么都没穿
        Decorator person = new Person(null);
        person.decorate();
        System.out.println();

        // 给穿件衣服
        person = new Dress(person);
        person.decorate();
        System.out.println();

        // 再给穿双鞋
        person = new Shoe(person);
        person.decorate();
        System.out.println();

        // 再戴付眼镜
        person = new Glasses(person);
        person.decorate();
        System.out.println();
    }

}

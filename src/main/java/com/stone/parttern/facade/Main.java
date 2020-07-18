package com.stone.parttern.facade;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        // 不是用门面模式，需要客户自己找工人装修
        // 装修房子
        // 找设计师设计
        Designer designer = new Designer();
        designer.work();

        // 找水暖工
        Plumber plumber = new Plumber();
        plumber.work();

        // 找电工
        CircuitWorker circuitWorker = new CircuitWorker();
        circuitWorker.work();

        // 软装饰
        Artist artist = new Artist();
        artist.work();

        System.out.println("House decorated, but too tired. Wu wu......");
        */

        // 使用门面模式，客户只需要找装修公司
        BuildHouseFacade bhf = new BuildHouseFacade();
        bhf.build();
        System.out.println("House decorated, but too expensive. Ha ha......");
    }

}

package com.stone.parttern.singleton;

/**
 * 饿汉式：简单，实用，线程安全
 * 推荐使用
 */
public class HungryMgr {

    // 构造方法私有化
    private HungryMgr() {

    }

    private static final HungryMgr INSTANCE;

    static {
        INSTANCE = new HungryMgr();
    }

    public static HungryMgr getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                HungryMgr mgr = HungryMgr.getInstance();
                System.out.printf("HungryMgr hashCode: %s\n", mgr.hashCode());
            }).start();
        }
    }
}

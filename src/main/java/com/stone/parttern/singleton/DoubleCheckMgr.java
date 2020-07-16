package com.stone.parttern.singleton;

/**
 * 懒汉式：双重检查，线程安全，麻烦
 * 不推荐使用
 */
public class DoubleCheckMgr {

    // 构造方法私有化
    private DoubleCheckMgr() {

    }

    private static volatile DoubleCheckMgr INSTANCE;

    public static DoubleCheckMgr getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckMgr.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckMgr();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                DoubleCheckMgr mgr = DoubleCheckMgr.getInstance();
                System.out.printf("DoubleCheckMgr hashCode: %s\n", mgr.hashCode());
            }).start();
        }
    }
}

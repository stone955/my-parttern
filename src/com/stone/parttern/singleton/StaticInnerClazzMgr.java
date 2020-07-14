package com.stone.parttern.singleton;

/**
 * 懒汉式：静态内部类，线程安全，简单
 * 推荐使用
 */
public class StaticInnerClazzMgr {

    // 构造方法私有化
    private StaticInnerClazzMgr() {

    }

    public static StaticInnerClazzMgr getInstance() {
        return StaticInnerClazzMgrHolder.INSTANCE;
    }

    private static class StaticInnerClazzMgrHolder {
        private static final StaticInnerClazzMgr INSTANCE;

        static {
            INSTANCE = new StaticInnerClazzMgr();
        }


    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                StaticInnerClazzMgr mgr = StaticInnerClazzMgr.getInstance();
                System.out.printf("StaticInnerClazzMgr hashCode: %s\n", mgr.hashCode());
            }).start();
        }
    }
}

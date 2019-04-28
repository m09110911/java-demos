package demo.java.pattern.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
    }

    /**
     *  利用了 类的加载机制
     *  调用该方法时候 才执行内部类的 逻辑
     *  完美的避开了 多线程问题，
     *
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyClassHolder.LAZY;
    }

    private static final class LazyClassHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}

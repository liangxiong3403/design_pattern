package singleton;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:15:28
 * @Description
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("单列对象生成");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

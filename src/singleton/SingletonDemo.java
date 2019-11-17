package singleton;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:15:29
 * @Description
 */
public class SingletonDemo {

    public static void main(String[] args) throws Exception {
        int size = 10;
        for (int i = 0; i < size; i++) {
            createThread();
        }
    }

    private static void createThread() {
        Runnable runnable = () -> {
            System.out.println(Singleton.getInstance());
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnable).start();
    }
}

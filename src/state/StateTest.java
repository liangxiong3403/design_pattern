package state;

import java.util.concurrent.TimeUnit;

/**
 * @author liangxiong
 * @date 2019-11-16 20:41
 * @description
 **/
public class StateTest {

    public static void main(String[] args) throws InterruptedException {
        SafeFrame frame = new SafeFrame("State Sample");
        int count = 24;
        while (true) {
            for (int hour = 0; hour < count; hour++) {
                frame.setClock(hour);
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}

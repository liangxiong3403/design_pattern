package bridge;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author liangxiong
 * @date 2019-11-06 21:08
 * @description 随机显示
 **/
public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 随机显示次数
     *
     * @param times
     */
    public void randomDisplay(int times) {
        open();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < random.nextInt(times); i++) {
            print();
        }
        close();
    }
}

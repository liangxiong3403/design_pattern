package observer;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author liangxiong
 * @date 2019-11-16 15:00
 * @description 随机数生成器
 **/
public class RandomNumberGenerator extends NumberGenerator {

    private int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        int times = 20;
        for (int i = 0; i < times; i++) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            this.number = random.nextInt(50);
            notifyObservers();
        }
    }
}

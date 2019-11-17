package strategy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:17:06
 * @Description
 */
public class WinningStrategy implements Strategy {

    private ThreadLocalRandom random;

    /**
     * 上一局是否获胜
     */
    private boolean won = false;

    /**
     * 上一局手势
     */
    private Hand prevHand;

    public WinningStrategy() {
        this.random = ThreadLocalRandom.current();
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}

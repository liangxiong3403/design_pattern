package strategy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:17:13
 * @Description
 */
public class ProStrategy implements Strategy {

    private ThreadLocalRandom random;

    /**
     * 上一局手势值
     */
    private int prevHandValue = 0;

    /**
     * 当前手势值
     */
    private int currentHandValue = 0;

    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    public ProStrategy() {
        this.random = ThreadLocalRandom.current();
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue;
        if (bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }

    private int getSum(int handValue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handValue][i];
        }
        return sum;
    }
}

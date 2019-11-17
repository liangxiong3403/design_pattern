package strategy;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:16:37
 * @Description 手势
 */
public class Hand {

    /**
     * 石头
     */
    public static final int HAND_VALUE_GUU = 0;

    /**
     * 剪刀
     */
    public static final int HAND_VALUE_CHO = 1;

    /**
     * 布
     */
    public static final int HAND_VALUE_PAA = 2;

    /**
     * 三种手势
     */
    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA)
    };

    /**
     * 手势对应字符串
     */
    public static final String[] name = {
            "石头", "剪刀", "布"
    };

    /**
     * 手势值
     */
    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    /**
     * 比较大小
     *
     * @param hand
     * @return
     */
    private int fight(Hand hand) {
        if (this == hand) {
            // 平局
            return 0;
        } else if ((handValue + 1) % 3 == hand.handValue) {
            // 胜
            return 1;
        } else {
            // 负
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}

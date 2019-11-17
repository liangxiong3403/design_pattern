package strategy;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:17:39
 * @Description 选手
 */
public class Player {

    /**
     * 选手姓名
     */
    private String name;

    /**
     * 策略
     */
    private Strategy strategy;

    /**
     * 胜利次数
     */
    private int winCount;

    /**
     * 失败次数
     */
    private int loseCount;

    /**
     * 比赛总次数
     */
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    /**
     * 下一局手势
     *
     * @return
     */
    public Hand nextHand() {
        return strategy.nextHand();
    }

    /**
     * 胜利
     */
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    /**
     * 失败
     */
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    /**
     * 平局
     */
    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}

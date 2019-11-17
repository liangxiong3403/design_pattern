package strategy;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:17:45
 * @Description
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Player player1 = new Player("Tom", new WinningStrategy());
        Player player2 = new Player("Jerry", new ProStrategy());
        int size = 1000;
        for (int i = 0; i < size; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
    }
}

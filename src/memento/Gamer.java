package memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author liangxiong
 * @date 2019-11-16 16:13
 * @description 游戏主人公
 **/
public class Gamer {

    /**
     * 金钱
     */
    private int money;

    /**
     * 水果
     */
    private List<String> fruits = new ArrayList<>(10);

    /**
     * 水果名称
     */
    private static String[] fruitNames = {"苹果", "葡萄", "香蕉", "橘子"};

    private ThreadLocalRandom random = ThreadLocalRandom.current();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    /**
     * 掷骰子
     */
    public void bet() {
        int dice = random.nextInt(1, 7);
        if (dice == 1) {
            this.money += 100;
            System.out.println("金钱增加100");
        } else if (dice == 2) {
            this.money /= 2;
            System.out.println("金钱减半");
        } else if (dice == 6) {
            String fruitName = getFruitName();
            System.out.println("获得了水果: " + fruitName);
            fruits.add(fruitName);
        } else {
            System.out.println("什么也没有发生");
        }
    }

    /**
     * 拍摄快照
     *
     * @return
     */
    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruitName = iterator.next();
            if (fruitName.startsWith("好吃的")) {
                memento.addFruit(fruitName);
            }
        }
        return memento;
    }

    /**
     * 撤销操作
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    /**
     * 获取水果名称
     *
     * @return
     */
    private String getFruitName() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}

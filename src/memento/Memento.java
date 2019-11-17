package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangxiong
 * @date 2019-11-16 16:10
 * @description 备忘录, 代表状态信息(状态包含金钱和水果)
 **/
public class Memento {

    /**
     * 金钱
     */
    private int money;

    /**
     * 水果
     */
    private ArrayList<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList(10);
    }

    protected void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return (List<String>) this.fruits.clone();
    }

    @Override
    public String toString() {
        return "Memento{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}

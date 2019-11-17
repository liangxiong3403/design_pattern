package memento;

import java.util.concurrent.TimeUnit;

/**
 * @author liangxiong
 * @date 2019-11-16 16:33
 * @description
 **/
public class MementoTest {

    public static void main(String[] args) throws InterruptedException {
        Gamer gamer = new Gamer(100);
        // 记录初始状态
        Memento memento = gamer.createMemento();
        int times = 100;
        for (int i = 0; i < times; i++) {
            System.out.println("i=: " + i);
            System.out.println("当前状态: " + gamer);
            System.out.println("备忘录状态: " + memento);
            gamer.bet();
            System.out.println("游戏后金钱数量: " + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱数量充足,可以继续游戏");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("金钱数量不足,恢复至上一次状态");
                gamer.restoreMemento(memento);
            }
            System.out.println("-------------------");
        }
        TimeUnit.MILLISECONDS.sleep(100);
    }
}

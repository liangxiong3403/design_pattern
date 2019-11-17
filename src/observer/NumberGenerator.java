package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liangxiong
 * @date 2019-11-16 14:52
 * @description 数值生成器抽象类
 **/
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>(10);

    /**
     * 新增观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObservers() {
        Iterator<Observer> iterator = this.observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(this);
        }
    }

    /**
     * 获取数字
     *
     * @return
     */
    public abstract int getNumber();

    /**
     * 生成数字
     */
    public abstract void execute();
}

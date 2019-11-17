package observer;

/**
 * @author liangxiong
 * @date 2019-11-16 15:08
 * @description
 **/
public class ObserverTest {

    public static void main(String[] args) {
        // 被观察对象
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        // 观察者
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        // 观察者开始观察
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        // 被观察者做出行动
        generator.execute();
    }
}

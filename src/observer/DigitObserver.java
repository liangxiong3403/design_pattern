package observer;

/**
 * @author liangxiong
 * @date 2019-11-16 15:03
 * @description 通过数字形式显示观察到的对象
 **/
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

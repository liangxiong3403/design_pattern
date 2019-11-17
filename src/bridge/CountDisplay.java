package bridge;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:15:41
 * @Description 自定义统计次数(类的功能层次结构)
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}

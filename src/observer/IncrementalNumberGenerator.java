package observer;

/**
 * @author liangxiong
 * @date 2019-11-16 15:35
 * @description
 **/
public class IncrementalNumberGenerator extends NumberGenerator {

    /**
     * 起始数字
     */
    private int start;

    /**
     * 最大数字
     */
    private int end;

    /**
     * 步长
     */
    private int interval;

    private int number;

    public IncrementalNumberGenerator(int start, int end, int interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i += interval) {
            this.number = i;
            notifyObservers();
        }
    }
}

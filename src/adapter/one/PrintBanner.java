package adapter.one;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:16:07
 * @Description 适配器类，对接实际需求
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String message) {
        super(message);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}

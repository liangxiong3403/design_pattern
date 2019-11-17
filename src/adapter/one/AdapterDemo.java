package adapter.one;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:16:08
 * @Description
 */
public class AdapterDemo {

    public static void main(String[] args) {
        Print print = new PrintBanner("hello world");
        print.printWeak();
        print.printStrong();
    }
}

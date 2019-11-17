package bridge;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:15:48
 * @Description 类的实现层次结构
 */
public class StringDisplayImpl extends DisplayImpl {

    /**
     * 需要显示地内容
     */
    private String input;

    /**
     * 字符宽度
     */
    private int width;

    public StringDisplayImpl(String input) {
        this.input = input;
        this.width = input.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + input + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

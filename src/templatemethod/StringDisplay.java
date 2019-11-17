package templatemethod;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:10:32
 * @Description
 */
public class StringDisplay extends AbstractDisplay {

    private String message;

    private int width;

    public StringDisplay(String message) {
        this.message = message;
        this.width = message.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + message + "|");
    }

    @Override
    public void close() {
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

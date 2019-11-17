package templatemethod;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:10:31
 * @Description
 */
public class CharDisplay extends AbstractDisplay {

    private char message;

    public CharDisplay(char message) {
        this.message = message;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(message);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}

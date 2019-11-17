package templatemethod;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:10:39
 * @Description
 */
public class TemplateDemo {

    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('a');
        display.display(5);
        display = new StringDisplay("hello,world");
        display.display(5);
    }
}

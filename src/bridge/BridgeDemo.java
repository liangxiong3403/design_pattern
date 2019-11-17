package bridge;

import java.io.IOException;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:16:01
 * @Description
 */
public class BridgeDemo {

    public static void main(String[] args) throws IOException {
        Display display = new Display(new StringDisplayImpl("hello,world"));
        display.display();

        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("give me five"));
        countDisplay.display();
        countDisplay.multiDisplay(3);

        RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("random display"));
        randomDisplay.randomDisplay(5);

        Display fileDisplay = new Display(new TextFileDisplayImpl("readme.txt"));
        fileDisplay.display();
    }
}

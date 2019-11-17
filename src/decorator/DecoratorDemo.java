package decorator;

import java.util.Arrays;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:16:10
 * @Description
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        // 不装饰地效果
        Display display = new StringDisplay("hello,world");
        display.show();
        System.out.println();
        // 左右装饰
        Border border = new SideBorder(display, '*');
        border.show();
        // 上下左右都装饰
        border = new FullBorder(display);
        border.show();
        // 上下修饰
        border = new UpDownBorder(display, '-');
        border.show();
        // 测试新功能
        border = new SideBorder(new MultiStringDisplay(Arrays.asList("Java", "C++", "PHP", "Python")), '#');
        border.show();
    }
}

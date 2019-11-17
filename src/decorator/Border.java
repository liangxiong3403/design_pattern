package decorator;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:15:45
 * @Description 装饰边框
 */
public abstract class Border extends Display {

    /**
     * 被装饰物
     */
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}

package templatemethod;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:10:29
 * @Description 显示功能抽象类
 */
public abstract class AbstractDisplay {

    /**
     * 显示
     */
    public final void display(int size) {
        open();
        for (int i = 0; i < size; i++) {
            print();
        }
        close();
    }

    /**
     * 打开
     */
    protected abstract void open();

    /**
     * 打印
     */
    protected abstract void print();

    /**
     * 关闭
     */
    protected abstract void close();
}

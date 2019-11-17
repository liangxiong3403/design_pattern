package bridge;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:15:34
 * @Description 类的实现层次结构
 */
public abstract class DisplayImpl {

    /**
     * 原生实现open
     */
    public abstract void rawOpen();

    /**
     * 原生实现print
     */
    public abstract void rawPrint();

    /**
     * 原生实现close
     */
    public abstract void rawClose();
}

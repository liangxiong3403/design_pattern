package adapter.one;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:16:04
 * @Description 打印功能接口
 */
public interface Print {

    /**
     * 弱化打印
     */
    void printWeak();

    /**
     * 增强打印
     */
    void printStrong();
}

package observer;

/**
 * @author liangxiong
 * @date 2019-11-16 14:50
 * @description 观察者
 **/
public interface Observer {

    /**
     * 处理事件
     *
     * @param generator
     */
    void update(NumberGenerator generator);
}

package iterator;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:15:11
 * @Description
 */
public interface Iterator {

    /**
     * 是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    Object next();
}

package prototype.framework;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:16:29
 * @Description
 */
public interface Product extends Cloneable {

    /**
     * 使用
     *
     * @param description
     */
    void use(String description);

    /**
     * 创建克隆
     *
     * @return
     */
    Product createClone();
}

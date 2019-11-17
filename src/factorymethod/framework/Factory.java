package factorymethod.framework;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:11:32
 * @Description 抽象工厂
 */
public abstract class Factory {

    /**
     * 创建(利用模板方法模式)
     *
     * @param owner 归属人
     */
    public final Product create(String owner, Integer number) {
        Product product = createProduct(owner, number);
        registerProduct(product);
        return product;
    }

    /**
     * 生产产品
     *
     * @param owner  归属人
     * @param number 编号
     * @return 产品
     */
    protected abstract Product createProduct(String owner, Integer number);

    /**
     * 注册产品
     *
     * @param product 产品
     */
    protected abstract void registerProduct(Product product);
}

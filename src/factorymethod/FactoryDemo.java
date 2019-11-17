package factorymethod;

import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:14:44
 * @Description
 */
public class FactoryDemo {

    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product product = factory.create("tom", 1);
        Product product2 = factory.create("sally", 2);
        Product product3 = factory.create("jerry", 3);
        product.use();
        product2.use();
        product3.use();
        System.out.println(factory.getOwners());
    }
}

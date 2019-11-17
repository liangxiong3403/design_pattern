package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:16:31
 * @Description 测试类
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Product p1 = new UnderlinePen('~');
        Product p2 = new MessageBox('*');
        Product p3 = new MessageBox('/');
        manager.register("strong message", p1);
        manager.register("warning box", p2);
        manager.register("slash box", p3);

        Product product = manager.create("strong message");
        product.use("hello,world");
        Product product2 = manager.create("warning box");
        product2.use("hello,world");
        Product product3 = manager.create("slash box");
        product3.use("hello,world");
    }
}

package prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:16:33
 * @Description
 */
public class Manager {

    private Map<String, Product> data = new HashMap<>(16);

    public void register(String name, Product product) {
        data.putIfAbsent(name, product);
    }

    public Product create(String productName) {
        Product product = data.get(productName);
        return product.createClone();
    }
}

package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:11:44
 * @Description ID卡工厂类
 */
public class IDCardFactory extends Factory {

    private Map<String, Integer> owners = new HashMap(16);

    @Override
    protected Product createProduct(String owner, Integer number) {
        IDCard card = new IDCard(owner, number);
        return card;
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        owners.putIfAbsent(card.getOwner(), card.getNumber());
    }

    public Map<String, Integer> getOwners() {
        return owners;
    }
}

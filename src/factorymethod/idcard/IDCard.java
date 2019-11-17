package factorymethod.idcard;

import factorymethod.framework.Product;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:11:40
 * @Description ID卡
 */
public class IDCard extends Product {

    private String owner;

    private Integer number;

    public IDCard(String owner, Integer number) {
        System.out.println("制作: " + owner + " 的ID卡");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println("使用: " + owner + " 的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getNumber() {
        return number;
    }
}

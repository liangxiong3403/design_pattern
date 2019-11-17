package prototype;

import prototype.framework.Product;

/**
 * @author liangxiong
 * @Date:2019/9/5
 * @Time:16:36
 * @Description 环绕字符修饰
 */
public class MessageBox implements Product {

    /**
     * 包装字符(用于修饰其他字符串)
     */
    private char decorate;

    public MessageBox(char decorate) {
        this.decorate = decorate;
    }

    @Override
    public void use(String description) {
        int length = description.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorate);
        }
        System.out.println(" ");
        System.out.println(decorate + " " + description + " " + decorate);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorate);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}

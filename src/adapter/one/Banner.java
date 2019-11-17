package adapter.one;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:16:05
 * @Description 已有地方法
 */
public class Banner {

    private String message;

    public Banner(String message) {
        this.message = message;
    }

    public void showWithParen() {
        System.out.println("(" + message + ")");
    }

    public void showWithAster() {
        System.out.println("*" + message + "*");
    }
}

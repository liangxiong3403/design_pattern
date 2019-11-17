package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:53
 * @description 测试类
 **/
public class ResponsibilityDemo {

    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        // 构建责任处理链条
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        // 构建问题
        int size = 500;
        for (int i = 0; i < size; i++) {
            alice.support(new Trouble(i));
        }
    }
}

package builder;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:15:15
 * @Description
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构造
     */
    public void build() {
        builder.makeTitle("Greeting");
        builder.makeMessage("早上到下午");
        builder.makeItems(new String[]{"早上好", "下午好"});
        builder.makeMessage("晚上");
        builder.makeItems(new String[]{"晚上好", "晚安", "再见"});
        builder.close();
    }

}

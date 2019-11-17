package interpreter;

/**
 * @author liangxiong
 * @date 2019-11-17 16:04
 * @description 原生关键字命令
 **/
public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        this.name = context.getCurrentToken();
        if (!"go".equals(name) && !"right".equals(name) && !"left".equals(name)) {
            throw new ParseException(name + "is undefined");
        }
        // 跳过当前token,比如:go,left,right
        context.skipToken(name);
    }

    @Override
    public String toString() {
        return "PrimitiveCommandNode{" +
                "name='" + name + '\'' +
                '}';
    }
}

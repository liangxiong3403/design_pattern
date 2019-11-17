package interpreter;

/**
 * @author liangxiong
 * @date 2019-11-17 15:46
 * @description 表示单条命令语句
 **/
public class CommandNode extends Node {

    /**
     * 单条命令语句可能包含普通语句或者循环体语句
     */
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        String keyword = "repeat";
        if (keyword.equals(context.getCurrentToken())) {
            // 解析循环体语句
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            // 解析普通语句
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return "CommandNode{" +
                "node=" + node +
                '}';
    }
}

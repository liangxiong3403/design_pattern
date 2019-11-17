package interpreter;

/**
 * @author liangxiong
 * @date 2019-11-17 16:01
 * @description 循环体命令节点(执行语句循环操作)
 **/
public class RepeatCommandNode extends Node {

    private int number;

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        String keyword = "repeat";
        context.skipToken(keyword);
        this.number = context.currentNumber();
        context.nextToken();
        this.commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "RepeatCommandNode{" +
                "number=" + number +
                ", commandListNode=" + commandListNode +
                '}';
    }
}

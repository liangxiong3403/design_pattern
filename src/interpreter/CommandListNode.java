package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangxiong
 * @date 2019-11-17 15:42
 * @description 命令列表节点(包含多个命令节点)
 **/
public class CommandListNode extends Node {

    /**
     * 表示命令节点的集合
     */
    private List<CommandNode> commandNodes = new ArrayList<>(10);

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            String keyword = "end";
            if (context.getCurrentToken() == null) {
                // 缺失结束语法关键字
                throw new ParseException("Missing end");
            } else if (keyword.equals(context.getCurrentToken())) {
                // 跳过语法关键字
                context.skipToken(keyword);
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
            }
        }
    }

    @Override
    public String toString() {
        return "CommandListNode{" +
                "commandNodes=" + commandNodes +
                '}';
    }
}

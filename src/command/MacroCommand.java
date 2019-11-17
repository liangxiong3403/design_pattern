package command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author liangxiong
 * @date 2019-11-17 09:59
 * @description 由多条命令整合地命令
 **/
public class MacroCommand implements Command {

    private Stack<Command> commands = new Stack<>();

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute();
        }
    }

    /**
     * 新增命令
     *
     * @param command
     */
    public void append(Command command) {
        if (command != this) {
            // 防止死循环
            commands.push(command);
        }
    }

    /**
     * 删除最后一条命令
     */
    public void undo() {
        if (!commands.isEmpty()) {
            this.commands.pop();
        }
    }

    /**
     * 清除所有命令
     */
    public void clear() {
        commands.clear();
    }
}

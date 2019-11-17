package command;

import java.awt.*;

/**
 * @author liangxiong
 * @date 2019-11-17 10:58
 * @description 切换颜色命令
 **/
public class ColorCommand implements Command {

    private Color color;

    private DrawCanvas drawable;

    public ColorCommand(Color color, DrawCanvas drawable) {
        this.color = color;
        this.drawable = drawable;
    }

    /**
     * 切换画笔颜色
     */
    @Override
    public void execute() {
        drawable.setColor(color);
    }
}

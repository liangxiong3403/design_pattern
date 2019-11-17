package command;

import java.awt.*;

/**
 * @author liangxiong
 * @date 2019-11-17 10:05
 * @description 绘制一个点的命令
 **/
public class DrawCommand implements Command {

    /**
     * 绘制对象
     */
    private Drawable drawable;

    /**
     * 坐标点
     */
    private Point point;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }

    /**
     * 执行具体命令
     */
    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}

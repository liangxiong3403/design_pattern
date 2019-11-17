package command;

import java.awt.*;

/**
 * @author liangxiong
 * @date 2019-11-17 10:09
 * @description 具体绘制类
 **/
public class DrawCanvas extends Canvas implements Drawable {

    /**
     * 颜色
     */
    private Color color = Color.red;

    /**
     * 半径
     */
    private int radius = 6;

    /**
     * 历史命令集合
     */
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 重新全部绘制
     *
     * @param graphics
     */
    @Override
    public void paint(Graphics graphics) {
        this.history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

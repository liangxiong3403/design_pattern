package command;

/**
 * @author liangxiong
 * @date 2019-11-17 10:06
 * @description 表示绘制能力的接口
 **/
public interface Drawable {

    /**
     * 绘制坐标点
     *
     * @param x x轴坐标
     * @param y y轴坐标
     */
    void draw(int x, int y);

}

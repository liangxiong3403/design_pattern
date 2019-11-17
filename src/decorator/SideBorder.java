package decorator;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:15:48
 * @Description 对字符串进行左右两侧修饰
 */
public class SideBorder extends Border {

    /**
     * 用来装饰别人的字符
     */
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    /**
     * 获取横向字符数
     *
     * @return
     */
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    /**
     * 获取纵向行数
     *
     * @return
     */
    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}

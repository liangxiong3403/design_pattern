package decorator;

/**
 * @author liangxiong
 * @date 2019-11-09 20:03
 * @description 上下修饰
 **/
public class UpDownBorder extends Border {

    private char borderChar;

    public UpDownBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine(borderChar, display.getColumns());
        } else if (row == display.getRows() + 1) {
            return makeLine(borderChar, display.getColumns());
        }
        return display.getRowText(row - 1);
    }

    /**
     * 生成一个重复count次字符c的字符串
     *
     * @param target 目标字符
     * @param count  重复次数
     * @return
     */
    private String makeLine(char target, int count) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < count; i++) {
            result.append(target);
        }
        return result.toString();
    }
}

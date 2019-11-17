package decorator;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:15:55
 * @Description 对字符串进行上下左右修饰
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
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
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            // 上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            // 下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        // 真实内容
        return "|" + display.getRowText(row - 1) + "|";
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

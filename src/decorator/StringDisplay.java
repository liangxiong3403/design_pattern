package decorator;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:15:36
 * @Description 显示单行字符串
 */
public class StringDisplay extends Display {

    /**
     * 需要显示地内容
     */
    private String message;

    public StringDisplay(String message) {
        this.message = message;
    }

    /**
     * 获取横向字符数
     *
     * @return
     */
    @Override
    public int getColumns() {
        return message.getBytes().length;
    }

    /**
     * 获取纵向行数
     *
     * @return
     */
    @Override
    public int getRows() {
        return 1;
    }

    /**
     * 仅当第0行时返回
     *
     * @param row 第几行
     * @return
     */
    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return this.message;
        }
        return null;
    }
}

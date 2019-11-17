package decorator;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:15:32
 * @Description
 */
public abstract class Display {

    /**
     * 获取横向字符数
     *
     * @return
     */
    public abstract int getColumns();

    /**
     * 获取纵向行数
     *
     * @return
     */
    public abstract int getRows();

    /**
     * 获取第row行的字符串
     *
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    /**
     * 全部显示
     */
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

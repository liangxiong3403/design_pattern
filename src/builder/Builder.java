package builder;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:15:10
 * @Description
 */
public interface Builder {

    /**
     * 生成标题
     *
     * @param title 标题
     */
    void makeTitle(String title);

    /**
     * 生成内容
     *
     * @param message 内容
     */
    void makeMessage(String message);

    /**
     * 生成条目
     *
     * @param items 条目
     */
    void makeItems(String[] items);

    /**
     * 关闭
     */
    void close();

    /**
     * 获取结果
     *
     * @return
     */
    String getResult();
}

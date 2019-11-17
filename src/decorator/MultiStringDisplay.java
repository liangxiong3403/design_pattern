package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:15:36
 * @Description 显示单行字符串
 */
public class MultiStringDisplay extends Display {

    /**
     * 需要显示地内容
     */
    private List<String> messages;

    public MultiStringDisplay(List<String> messages) {
        this.messages = new ArrayList<>(messages);
    }

    /**
     * 获取横向字符数
     *
     * @return
     */
    @Override
    public int getColumns() {
        return messages.parallelStream().max((a, b) -> a.getBytes().length > b.getBytes().length ? 1 : (a.getBytes().length < b.getBytes().length ? -1 : 0)).get().getBytes().length;
    }

    /**
     * 获取纵向行数
     *
     * @return
     */
    @Override
    public int getRows() {
        return messages.size();
    }

    /**
     * 仅当第0行时返回
     *
     * @param row 第几行
     * @return
     */
    @Override
    public String getRowText(int row) {
        return messages.get(row);
    }
}

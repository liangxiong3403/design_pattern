package builder;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:15:20
 * @Description
 */
public class TextBuilder implements Builder {

    private StringBuilder builder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        builder.append("===============");
        builder.append("[" + title + "]\n");
        builder.append("\n");
    }

    @Override
    public void makeMessage(String message) {
        builder.append('$' + message + "\n");
        builder.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            builder.append("-" + items[i] + "\n");
        }
        builder.append("\n");
    }

    @Override
    public void close() {
        builder.append("===============\n");
    }

    @Override
    public String getResult() {
        return builder.toString();
    }
}

package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:16
 * @Description 页面
 */
public abstract class Page {

    /**
     * 标题
     */
    protected String title;

    /**
     * 作者
     */
    protected String author;

    /**
     * 内容
     */
    protected List<Item> content = new ArrayList<>(10);

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String filename = title + ".html";
        try {
            Writer writer = new FileWriter(filename);
            writer.write(makeHTML());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成html
     *
     * @return
     */
    public abstract String makeHTML();
}

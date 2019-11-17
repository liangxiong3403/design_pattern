package facade;

import java.io.IOException;
import java.io.Writer;

/**
 * @author liangxiong
 * @date 2019-11-10 20:43
 * @description html编写类
 **/
public class HtmlWriter {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    /**
     * 生成标题
     *
     * @param title 标题
     * @throws IOException
     */
    public void title(String title) throws IOException {
        writer.write("<meta charset=\"UTF-8\">");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    /**
     * 输出段落
     *
     * @param message 消息体
     * @throws IOException
     */
    public void paragraph(String message) throws IOException {
        writer.write("<p>" + message + "</p>\n");
    }

    /**
     * 输出超链接
     *
     * @param href    超链接地址
     * @param caption 描述
     * @throws IOException
     */
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    /**
     * 输出邮件地址
     *
     * @param mailAddress 邮件地址
     * @param username    用户名
     * @throws IOException
     */
    public void mailto(String mailAddress, String username) throws IOException {
        link("mailto:" + mailAddress, username);
    }

    /**
     * 关闭输出流
     *
     * @throws IOException
     */
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}

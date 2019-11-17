package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author liangxiong
 * @date 2019-11-10 20:52
 * @description 页面生成器, 利用了facade模式
 **/
public class PageMaker {

    private PageMaker() {
    }

    /**
     * 生成欢迎页面
     *
     * @param mailAddress 邮件地址
     * @param filename    文件名称
     */
    public static void makeWelcomePage(String mailAddress, String filename) {
        Properties properties = Database.getProperties("E:/idea_project/design_pattern/src/facade/test");
        String username = properties.getProperty(mailAddress);
        try {
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("Welcome to " + username + "'s page!");
            htmlWriter.paragraph(username + " 欢迎来到 " + username + " 的主页.");
            htmlWriter.paragraph("等着你的邮件喔!");
            htmlWriter.mailto(mailAddress, username);
            htmlWriter.close();
            System.out.println(filename + " is created for " + mailAddress + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

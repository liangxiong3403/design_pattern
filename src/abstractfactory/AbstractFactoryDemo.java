package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:48
 * @Description
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 具体工厂
        Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory");
        // 零部件
        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);
        // 产品
        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }


}

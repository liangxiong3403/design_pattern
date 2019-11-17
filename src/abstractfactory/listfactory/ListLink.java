package abstractfactory.listfactory;

import abstractfactory.factory.Link;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:35
 * @Description 具体链接
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * a标签包装超链接
     *
     * @return
     */
    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}

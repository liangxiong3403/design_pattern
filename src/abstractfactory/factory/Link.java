package abstractfactory.factory;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:11
 * @Description 超链接
 */
public abstract class Link extends Item {

    /**
     * 超链接地址
     */
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

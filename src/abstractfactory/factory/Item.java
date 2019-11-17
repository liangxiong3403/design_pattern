package abstractfactory.factory;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:07
 * @Description 项目
 */
public abstract class Item {

    /**
     * 标题
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 生成html内容
     *
     * @return
     */
    public abstract String makeHTML();
}

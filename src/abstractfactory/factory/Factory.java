package abstractfactory.factory;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:23
 * @Description 抽象工厂
 */
public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     * 创建链接
     *
     * @param caption 标题
     * @param url     地址
     * @return
     */
    public abstract Link createLink(String caption, String url);

    /**
     * 创建托盘
     *
     * @param caption 标题
     * @return
     */
    public abstract Tray createTray(String caption);

    /**
     * 创建页面
     *
     * @param title  标题
     * @param author 作者
     * @return
     */
    public abstract Page createPage(String title, String author);
}

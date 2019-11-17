package adapter.two;

import adapter.one.Banner;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:16:07
 * @Description 适配器类，对接实际需求
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String message) {
        this.banner = new Banner(message);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

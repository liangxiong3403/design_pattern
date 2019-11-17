package abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangxiong
 * @Date:2019/9/8
 * @Time:20:13
 * @Description 托盘
 */
public abstract class Tray extends Item {

    protected List<Item> tray = new ArrayList<>(10);

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}

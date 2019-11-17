package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:14:54
 * @Description 文件夹
 */
public class Directory extends Entry {

    /**
     * 名称
     */
    private String name;

    /**
     * 文件夹集合
     */
    private List<Entry> directory = new ArrayList<>(10);

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.printList(prefix + "/" + name);
        }
    }
}

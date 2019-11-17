package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liangxiong
 * @date 2019-11-09 21:00
 * @description 文件夹
 **/
public class Directory extends Entry {

    private String name;

    public Directory(String name) {
        this.name = name;
    }

    private List<Entry> entries = new ArrayList<>(10);

    @Override
    public void accept(Visitor visitor) throws FileTreatmentException {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        Iterator<Entry> iterator = entries.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            sum += entry.getSize();
        }
        return sum;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        this.entries.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return this.entries.iterator();
    }
}

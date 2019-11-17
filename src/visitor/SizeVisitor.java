package visitor;

import java.util.Iterator;

/**
 * @author liangxiong
 * @date 2019-11-09 22:03
 * @description 获取条目大小
 **/
public class SizeVisitor extends Visitor {

    private int size;

    @Override
    public void visit(File file) {
        this.size = file.getSize();
    }

    @Override
    public void visit(Directory directory) throws FileTreatmentException {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}

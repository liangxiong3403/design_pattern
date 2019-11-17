package visitor;

import java.util.Iterator;

/**
 * @author liangxiong
 * @date 2019-11-09 21:24
 * @description 具体访问者, 执行实际访问操作
 **/
public class ListVisitor extends Visitor {

    private String filename = "";

    @Override
    public void visit(File file) {
        System.out.println(filename + "/" + file);
    }

    @Override
    public void visit(Directory directory) throws FileTreatmentException {
        System.out.println(filename + "/" + directory);
        String temp = filename;
        filename = filename + "/" + directory.getName();
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            // 递归调用
            entry.accept(this);
        }
        // 恢复变量初始值
        filename = temp;
    }
}

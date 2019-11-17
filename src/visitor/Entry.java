package visitor;


import java.util.Iterator;

/**
 * @author liangxiong
 * @date 2019-11-09 21:00
 * @description 条目
 **/
public abstract class Entry implements Element {

    /**
     * 获取名称
     *
     * @return
     */
    public abstract String getName();

    /**
     * 获取文件大小
     *
     * @return
     */
    public abstract int getSize();

    /**
     * 新增条目
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 获取迭代器
     *
     * @return
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

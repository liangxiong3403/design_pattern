package composite;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:14:34
 * @Description 目录条目
 */
public abstract class Entry {

    /**
     * 获取条目名称
     *
     * @return
     */
    public abstract String getName();

    /**
     * 获取条目大小
     *
     * @return
     */
    public abstract int getSize();

    /**
     * 新增目录条目
     *
     * @param entry
     * @return
     * @throws Exception
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("illegal operation");
    }

    /**
     * 打印目录条目
     */
    public void printList() {
        printList(" ");
    }

    /**
     * 列表显示条目名称
     *
     * @param prefix
     */
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

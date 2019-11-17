package composite;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:14:49
 * @Description 文件
 */
public class File extends Entry {

    /**
     * 名称
     */
    private String name;

    /**
     * 文件大小
     */
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}

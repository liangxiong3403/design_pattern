package iterator;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:15:23
 * @Description 书架迭代器
 */
public class BookShelfIterator implements Iterator {

    /**
     * 书架
     */
    private BookShelf bookShelf;

    /**
     * 遍历到那个地方了
     */
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 是否有下一个元素
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}

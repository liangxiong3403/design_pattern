package iterator;

import java.util.ArrayList;

/**
 * @author liangxiong
 * @Date:2019/9/4
 * @Time:15:15
 * @Description 书架
 */
public class BookShelf implements Aggregate {

    private ArrayList<Book> books;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    /**
     * 获取指定索引对象
     *
     * @param index
     * @return
     */
    public Book getBookAt(int index) {
        if (index < 0 || index >= this.books.size()) {
            throw new IllegalArgumentException("index is illegal");
        }
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

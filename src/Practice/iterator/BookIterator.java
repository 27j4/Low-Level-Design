package Practice.iterator;

import java.util.List;

public class BookIterator implements Iterator {

    List<Book> bookList;
    int position;

    public BookIterator(List<Book> bookList){
        position = 0;
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
       return position < bookList.size();
    }

    @Override
    public Book next() {
        return bookList.get(position++);
    }
}

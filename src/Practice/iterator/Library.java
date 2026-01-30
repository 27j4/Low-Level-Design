package Practice.iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection{

    private List<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    @Override
    public BookIterator createIterator() {
        return new BookIterator(bookList);
    }
}

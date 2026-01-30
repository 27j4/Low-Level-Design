package Practice.iterator;

public class IteratorMain {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("an", 87));
        library.addBook(new Book("abc", 47));
        library.addBook(new Book("agh", 27));
        library.addBook(new Book("a", 87));

        BookIterator iterator = library.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        library.addBook(new Book("anshul", 87));

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

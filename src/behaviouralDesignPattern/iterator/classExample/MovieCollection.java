package behaviouralDesignPattern.iterator.classExample;

public interface MovieCollection {
    MovieIterator<Movie> createIterator();
}

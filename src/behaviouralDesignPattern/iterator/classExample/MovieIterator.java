package behaviouralDesignPattern.iterator.classExample;

public interface MovieIterator<M> {
    boolean hasNext();
    Movie next();
}

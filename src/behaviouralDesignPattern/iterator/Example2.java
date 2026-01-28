package behaviouralDesignPattern.iterator;

// Custom Iterator
interface MyIterator<T> {
    boolean hasNext();
    boolean hasPrev();
    T next();
    T prev();
}

// Custom Iterable
interface MyIterable<T> {
    MyIterator<T> getIterator();
}

// LinkedList Iterator
class MyLinkedListIterator<T> implements MyIterator<T> {

    private MyLinkedList<T> current;

    public MyLinkedListIterator(MyLinkedList<T> start) {
        this.current = start;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public boolean hasPrev() {
        return current != null && current.prev != null;
    }

    @Override
    public T next() {
        T val = current.data;
        current = current.next;
        return val;
    }

    @Override
    public T prev() {
        T val = current.data;
        current = current.prev;
        return val;
    }
}

// Doubly Linked List Node + Collection
class MyLinkedList<T> implements MyIterable<T> {

    T data;
    MyLinkedList<T> next;
    MyLinkedList<T> prev;

    public MyLinkedList(T data) {
        this.data = data;
    }

    // Utility method to add node at end
    public MyLinkedList<T> add(T data) {
        MyLinkedList<T> node = new MyLinkedList<>(data);
        MyLinkedList<T> temp = this;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        return this;
    }

    @Override
    public MyIterator<T> getIterator() {
        return new MyLinkedListIterator<>(this);
    }
}

// Demo
public class Example2 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>(10);
        list.add(20).add(30).add(40);

        MyIterator<Integer> iterator = list.getIterator();

        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();



//        iterator.prev();
//
//        while (iterator.hasPrev()){
//            System.out.print(iterator.prev() + " ");
//        }
    }
}

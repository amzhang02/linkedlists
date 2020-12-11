public interface SimpleList<E> {
    // This is based on the java.util.List interface and the java.util.LinkedList class.
    // For documentation of these methods,
    //    see http://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
    // You should throw an IndexOutOfBoundsException or a NoSuchElementException
    //    in certain cases as specified by the documentation.


    public int size();
    public void clear();
    public boolean isEmpty();

    public E getFirst();
    public E getLast();
    public void addFirst(E thing);
    public void addLast(E thing);
    public E removeFirst();
    public E removeLast();

    public boolean add(E thing);

    public void add(int index, E thing);
    public E get(int index);
    public E set(int index, E thing);
    public E remove(int index);

    public int indexOf(E thing);
    public boolean contains(E thing);
}

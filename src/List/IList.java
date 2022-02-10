package List;

public interface IList<E> extends ICollection {
    void insertFront(E e);
    void insertBack(E e);
    E removeFront();
    E removeBack();
    E getFirst();
    E getLast();
    E get(int index);
    @Override
    default boolean isFull() {
        return false;
    }
}

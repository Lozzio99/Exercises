package Queue;

import List.ICollection;

public interface IQueue<E> extends ICollection {
    E dequeue();
    void enqueue(E item);
    E peek();
    IQueue<E> reversed();
}
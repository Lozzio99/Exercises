package Stack;

import List.ICollection;

public interface IStack<E> extends ICollection {
    void push(E x);
    E pop();
    E peek();
}

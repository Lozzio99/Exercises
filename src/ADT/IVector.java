package ADT;


public interface IVector<E extends Comparable<E>> extends Comparable<IVector<E>>{
    E[] x();
    IVector<E> multiply(IVector<E> other);
    IVector<E> multiply(E value);
    default int compareTo(IVector<E> other) {
        for (int i = 0; i< x().length;){
            int compare =  x()[i].compareTo(other.x()[i]);
            if (compare == 0) {
                i++;
                continue;
            }
            return compare;
        }
        return 0;
    }
}


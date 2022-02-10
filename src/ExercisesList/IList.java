package ExercisesList;
public interface IList<E>  {
    E first();
    E removeFirst();
    void add(E element);
    int size();
    E getItemAt(int index);
    default boolean isEmpty() {
        return size() == 0 && first() == null;
    }
}

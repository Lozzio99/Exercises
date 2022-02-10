package ExercisesCompare;

public interface INumber<E> extends Comparable<INumber<E>> {
    E getNumber();
    E multiply(E value);


    default boolean isLessThan(INumber<E> other){
        return compareTo(other) < 0;
    }

    default boolean isGreaterThan(INumber<E> other){
        return compareTo(other) > 0;
    }

    default boolean isEqualTo(INumber<E> other){
        return compareTo(other) == 0;
    }


}

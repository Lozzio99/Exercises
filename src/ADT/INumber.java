package ADT;

public interface INumber<E> extends Comparable<INumber<E>> {
    E x();
    INumber<E> multiply(INumber<E> x);
}

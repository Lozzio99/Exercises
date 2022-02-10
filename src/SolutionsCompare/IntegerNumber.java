package SolutionsCompare;

import ExercisesCompare.INumber;

public class IntegerNumber implements INumber<Integer> {

    private final Integer number;

    public IntegerNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Integer getNumber() {
        return this.number;
    }

    @Override
    public Integer multiply(Integer value) {
        return this.number * value;
    }

    @Override
    public int compareTo(INumber<Integer> o) {
        if (this.number.equals(o.getNumber())) return 0;
        return this.number < o.getNumber()?-1 :1;
    }
}

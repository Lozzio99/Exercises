package SolutionsCompare;

import ExercisesCompare.INumber;

public class DoubleNumber implements INumber<Double> {
    private final Double number;

    public DoubleNumber(Double number) {
        this.number = number;
    }

    @Override
    public Double getNumber() {
        return this.number;
    }

    @Override
    public Double multiply(Double value) {
        return this.number * value;
    }

    @Override
    public int compareTo(INumber<Double> o) {
        if (this.number.equals(o.getNumber())) return 0;
        return this.number < o.getNumber()?-1 :1;
    }
}

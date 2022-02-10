package SolutionsCompare;

import ExercisesCompare.INumber;

public class StringNumber implements INumber<String> {
    private final String number;
    public StringNumber(String number) {
        this.number = number;
    }
    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public String multiply(String value) {
        //repeat this element as many times as the position in the alphabet of the other number first letter
        return getNumber().repeat(positionInAlphabet(value.toCharArray()[0]));
    }
    /**
     * @param c any character within the alphabet
     * returns the int position of the first letter
     */
    private static int positionInAlphabet(char c) {
        int temp_integer = 96; //for lower case
        if((int)c <=122 & (int)c >=97)
            return ((int)c -temp_integer);
        return -1;
    }

    @Override
    public int compareTo(INumber<String> o) {
        return getNumber().compareTo(o.getNumber());
    }
}

package ADT;

import java.util.Objects;

public class StringNumber implements Comparable<INumber<String>>, INumber<String> {
    private final String x;

    public StringNumber(String x) {
        this.x = x;
    }

    @Override
    public String x() {
        return this.x;
    }

    @Override
    public int compareTo(INumber<String> o) {
        return Objects.compare(x(),o.x(), String::compareTo);
    }

    private static int position(String str) {
        char[] ch  = str.toCharArray();
        for(char c : ch){
            int temp_integer = 96; //for lower case
            if((int)c <=122 & (int)c >=97)
                return ((int)c -temp_integer);
        }
        return 0;
    }

    @Override
    public INumber<String> multiply(INumber<String> o) {
        return new StringNumber(x().repeat(position(o.x())));
    }

    @Override
    public String toString() {
        return "%s".formatted(x());
    }
}

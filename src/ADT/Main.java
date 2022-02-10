package ADT;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        System.out.println(
                new StringNumber("s").
                        multiply(new StringNumber("a"))
        );
        System.out.println(
                new StringNumber("s").
                        multiply(new StringNumber("z"))
        );

        System.out.println(Stream.of(
                                new StringNumber("d"),
                                new StringNumber("e"),
                                new StringNumber("a"),
                                new StringNumber("c"),
                                new StringNumber("b"),
                                new StringNumber("f")).
                        sorted().
                        collect(Collectors.toList())
        );
    }

}

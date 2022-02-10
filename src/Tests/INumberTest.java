package Tests;


import SolutionsCompare.DoubleNumber;
import SolutionsCompare.IntegerNumber;
import SolutionsCompare.StringNumber;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class INumberTest {

    public static void main(String[] args) {

        System.out.println(!new StringNumber("aaa").isEqualTo(new StringNumber("aab")));
        System.out.println(new StringNumber("aaa").isEqualTo(new StringNumber("aaa")));
        System.out.println(new StringNumber("aaa").isLessThan(new StringNumber("aab")));
        System.out.println(new StringNumber("aaB").isGreaterThan(new StringNumber("aaa")));

        System.out.println(new StringNumber("a").multiply("z"));

        System.out.println(Stream.of(
                new StringNumber("a"),
                new StringNumber("f"),
                new StringNumber("g"),
                new StringNumber("c"),
                new StringNumber("b"),
                new StringNumber("d"),
                new StringNumber("e")
        ).sorted().map(StringNumber::getNumber).collect(Collectors.toList()));

        System.out.println(Stream.of(
                new DoubleNumber(2.),
                new DoubleNumber(6.),
                new DoubleNumber(5.),
                new DoubleNumber(1.),
                new DoubleNumber(3.),
                new DoubleNumber(7.),
                new DoubleNumber(4.)
        ).sorted().map(DoubleNumber::getNumber).collect(Collectors.toList()));


        System.out.println(Stream.of(
                new IntegerNumber(2),
                new IntegerNumber(6),
                new IntegerNumber(5),
                new IntegerNumber(1),
                new IntegerNumber(3),
                new IntegerNumber(7),
                new IntegerNumber(4)
        ).sorted().map(IntegerNumber::getNumber).collect(Collectors.toList()));

    }

}

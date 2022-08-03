package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter4Video2 {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial=
                (x) -> (y, z) -> add.apply(x, y, z);
        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);
        System.out.println(add5.apply(6, 7));

        BiFunction<Integer, Integer, Function<Integer, Integer>> addBiPartial=
                (x, y) -> (z) -> add.apply(x, y, z);
        Function<Integer, Integer> add5and6 = addBiPartial.apply(5, 6);
        System.out.println(add5and6.apply(7));


        Function<Integer, Function<Integer, Function<Integer, Integer>>> addAndAddPartial=
                (x) -> (y) -> (z) -> add.apply(x, y, z);

        Function<Integer, Function<Integer, Integer>> add3 = addAndAddPartial.apply(3);
        Function<Integer, Integer> add3and4 = add3.apply(4);
        int sum = add3and4.apply(5);
        System.out.println(sum);
    }
}

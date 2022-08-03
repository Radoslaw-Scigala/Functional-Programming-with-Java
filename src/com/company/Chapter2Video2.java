package com.company;

import java.util.function.Function;

public class Chapter2Video2 {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;
        // The same function, but wrote to be more readable.
        /*Function<Integer, Integer> absoluteValue = (x) -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };*/

        System.out.println(absoluteValue.apply(-100));
    }

}

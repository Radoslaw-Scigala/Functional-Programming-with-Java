package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter3Video2 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        List<Integer> evens = listOfIntegers.stream()
                .filter(isEven)
                .toList();

        System.out.println(evens);


        String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        Function<Integer, Predicate<String>> createLengthTest = (minLength) ->
                (str) -> str.length() > minLength;

        Predicate<String> isLongerThan5 = createLengthTest.apply(5);

        List<String> longWords = words.stream()
                .filter(isLongerThan5)
                .toList();

        System.out.println(longWords);
    }
}

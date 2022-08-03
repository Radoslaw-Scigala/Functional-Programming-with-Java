package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Chapter3Video4 {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        /*List<String> longWords = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toList());*/

        /*Set<String> longWords = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.toSet());*/

        /*String longWords = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.joining("--"));*/

        /*Long longWords = words
                .stream()
                .filter((word) -> word.length() > 5)
                .collect(Collectors.counting());*/

        Map<Integer, List<String>> longWords = words
                .stream()
                .collect(Collectors.groupingBy(
                        (word) -> word.length() //String::length
                ));

        /*Map<Boolean, List<String>> longWords = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 5
                ));*/

        System.out.println(longWords);
    }
}

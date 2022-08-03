package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter3Video8 {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Uppercasing " + word);
                    return word.toUpperCase();
                })
                .map(word -> {
                    System.out.println("Adding exclamation point to " + word);
                    return word + "!";
                })
                .toList();

        System.out.println(processedWords);
    }
}

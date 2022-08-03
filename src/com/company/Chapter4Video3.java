package com.company;

public class Chapter4Video3 {

    static void countDown(int x) {
        System.out.println(x);
        if (x == 0)
            System.out.println("Done!");
        if (x > 0)
            countDown(x - 1);
    }

    static void countUp(int x, int stop) {
        System.out.println(x);
        if (x == stop)
            System.out.println("Done!");
        if (x < stop)
            countUp(x + 1, stop);
    }

    public static void main(String[] args) {
        countDown(10);
        countUp(0, 10);
    }
}

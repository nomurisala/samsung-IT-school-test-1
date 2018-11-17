package com.company;

public class FifthTask {
    public static void main(String[] args) {
        int x = 9, fromA = 10, toB = 11, fromSecondA = 12, toSecondB = 13;
        boolean result = isBelongToSection(x, fromA, toB, fromSecondA, toSecondB);
        System.out.println(result);
    }

    static boolean isBelongToSection(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if (fromA <= x && toB >= x)
        {
            return true;
        }
        else if (fromSecondA <= x && toSecondB >= x) {
            return true;
        }
        else {
            return false;
        }
    }
}
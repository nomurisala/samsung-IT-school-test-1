package com.company;

public class FourthTask {

    public static void main(String[] args) {
        boolean result = isDivisibleThree(9);
        System.out.println(result);
    }

    static boolean isDivisibleThree(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

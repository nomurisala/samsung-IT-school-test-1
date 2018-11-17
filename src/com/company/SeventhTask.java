package com.company;

import java.util.Arrays;

public class SeventhTask {

    public static void main(String[] args) {
        int[] array = {1, 8, 1, 67, 52, 45, 257, 3571, 246, 23, 0, 919, 0};
        printMaxOfArray(array);
    }

    static void printMaxOfArray(int[] array) {
        for (int k = 1; k < array.length; k++) {
            int newElement = array[k];
            int location = k - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
        System.out.println(array[array.length - 1]);
    }
}
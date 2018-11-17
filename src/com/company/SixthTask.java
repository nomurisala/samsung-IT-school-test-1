package com.company;

import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        int[] array = {10, 50, 18, 193, 591, 561};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverseArray(int[] someArray) {
        int last = someArray.length - 1;
        for (int i = 0; i < someArray.length / 2; i++) {
            int tmp = someArray[i];
            someArray[i] = someArray[last];
            someArray[last] = tmp;
            last--;
        }
    }
}
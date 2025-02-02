package com.assignment2;

import java.util.Arrays;

public class Q5SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {22, 55, 110, -1, 0, 766, 433, 211, 88, 5};
        selectionSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
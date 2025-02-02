package com.assigment2;

import java.util.Arrays;

public class Q4MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {22, 55, 110, -1, 0, 766, 433, 211, 88, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
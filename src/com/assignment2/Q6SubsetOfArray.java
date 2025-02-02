package com.assignment2;

import java.util.HashSet;

public class Q6SubsetOfArray {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }

    static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1 to the set
        for (int value : arr1) {
            set.add(value);
        }

        // Check if all elements of arr2 are in the set
        for (int value : arr2) {
            if (!set.contains(value)) {
                return false;
            }
        }

        return true;
    }
}
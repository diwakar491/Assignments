package com.assignment2;

public class Q1DuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {-44,0,55,-66,77,33,33,88,99,101,0,-44};
        System.out.println("duplicate elements  are:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                    break;

                }
            }
        }
    }
}

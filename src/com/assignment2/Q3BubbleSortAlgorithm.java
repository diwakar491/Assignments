package com.assignment2;

import java.util.Arrays;
public class Q3BubbleSortAlgorithm {

    public static void main(String[] args) {
        int[] arr= {22,55,110,-1,0,766,433,211,88,5};
        bubbleSort(arr);
        System.out.println("the sorted array  is : "+Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length-1; i++)
        {
            swapped=false;
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }

            }
            if (!swapped)
            {
                break;
            }
        }
    }

}

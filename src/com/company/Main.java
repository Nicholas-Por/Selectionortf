package com.company;

import java.util.Arrays;

public class Main {

    public static void Main(int[] arr)
    {
        //Loops through unsorted array
        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = i;
            //Compares arr[i] with all other indexes
            for(int j = i + 1; j<arr.length; j++)
            {
                //Sets min to the index with a number smaller the index it was currently at
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            //Swaps the two indexes, unless it is at the same position
            if(min != i)
            {
                swap(arr, i, min);
            }

        }
    }
    public static void swap(int[] arr, int i, int min)
    {
        int temp = i;
        arr[i] = min;
        min = temp;
    }
}
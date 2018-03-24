package com.sample;

import java.util.Arrays;


public class InsertSort {

    private static void sort(int[] array) {
        //edge case for array of size <= 1
        if (array.length <=1) {
          System.out.println("Was already sorted - " + Arrays.toString(array));
          return;
        }

        // start outer loop to go from 2 to n
        for (int i = 0; i < array.length -1; i++) {
            // start inner loop to insert the element into sorted array
            for (int j = i+1; j>= 1 ; j--) {
                System.out.print("[i=" + i+"], " + "[j="+j+"] " + Arrays.toString(array) + " ");
                if (array[j]<array[j-1]) {
                  System.out.println("swapping " + array[j-1] + " and " + array[j]);
                  swapElements(array, j, j - 1);

                }
                else {
                  System.out.println("no swap");

                  break;
                }
            }

        }
        System.out.println("Sorted array is " + Arrays.toString(array));

    }

    private static void swapElements(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {32, 43, 3, 15, 7};
        System.out.println("Input = " + Arrays.toString(arr));

	      sort(arr);
    }
}

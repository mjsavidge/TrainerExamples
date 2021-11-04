package com.company;

public class BubbleSort {
    // method to sort an arr. requires a parameter of int arr
    public void bubbleSort(int[] arr){
        int n = arr.length;
        // requires a placeholder to do a swap if the
        // previous number is greater than the curr number.
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}

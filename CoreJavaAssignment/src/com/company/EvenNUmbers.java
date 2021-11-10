package com.company;

public class EvenNUmbers {
    public void printEvenNumbers(int arraySize){
        int[] arr = new int[arraySize];
        for(int i=0; i < arr.length;i++){
            arr[i]=i+1;
        }
        for (int even : arr) {
            //if the value is divisible by two then its even
            if (even % 2 == 0) {
                System.out.println("Even: " + even);
            }
        }

    }
}

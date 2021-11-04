package com.company;

public class Main {

    public static void main(String[] args) {
	// bubble sort
        int[] arr = {1,0,5,6,3,2,3,7,9,8,4};

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(i);
        }
        //**************************************
        // 25 Fibonacci numbers beginning with 0
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i <= 25; i++){
            System.out.println(fibonacci.fibonacciNumbers(i));
        }
    }
}

package com.company;

public class Fibonacci {

    public int fibonacciNumbers(int n){
        if (n <= 1){
            return n;
        }
        return fibonacciNumbers(n-1) + fibonacciNumbers(n-2);
    }
}

package com.company;

import SecondPackage.Q11;

import java.util.ArrayList;

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
        //**************************************
        ReverseString rs = new ReverseString();
        String x = "hello";
        System.out.println(rs.reverseString(x));
        //**************************************
        int z = 4;
        NFactorial nf = new NFactorial();
        System.out.println(nf.computeFactorial(z));
        //***************************************
        SubString subString = new SubString();
        System.out.println(subString.sub("hello", 3));
        //***************************************
        CheckIfEven checkIfEven = new CheckIfEven();
        int numberToBeChecked = 101;
        if(checkIfEven.isEven(numberToBeChecked)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        //****************************************
        //palindrome
        Palindrome palindrome = new Palindrome();
        ArrayList<String> myList = new ArrayList<String>();
        ArrayList<String> myPalindromes = new ArrayList<String>();
        ArrayList<String> noPalindromes = new ArrayList<String>();
        myList.add("karan");
        myList.add("madam");
        myList.add("tom");
        myList.add("civic");
        myList.add("radar");
        myList.add("sexes");
        myList.add("jimmy");
        myList.add("kayak");
        myList.add("john");
        myList.add("refer");
        myList.add("billy");
        myList.add("did");

        for (String palin : myList){
            //if it is a palindrome
            if(palindrome.isPalidrome(palin))
            {
                //adds the palindrome word to the palindrome Arraylist
                myPalindromes.add(palin);
            }
            else{
                //adds the non palindrome to the NonPalindrome ArrayList
                noPalindromes.add(palin);
            }
        }
        //print out the list to the console
        System.out.println("Original List: ");
        System.out.println(myList);

        System.out.println("Palindrome list: ");
        System.out.print(myPalindromes);
        //*******************************************
        //Prime number check
        IsPrime isPrime = new IsPrime();
        ArrayList<Integer>  primesList = new ArrayList<Integer>();
        ArrayList<Integer> myPrimes = new ArrayList<Integer>();
        ArrayList<Integer> notPrimes = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            primesList.add(i);
        }

        //System.out.println(myList);

        for (int primes : primesList) {

            //if it is a palindrome
            if (isPrime.findingPrime(primes)) {
                //adds the num word to the prime Arraylist
                //System.out.println("prime: "+primes);
                myPrimes.add(primes);
            } else {
                //adds the non to the prime ArrayList
                //System.out.println("Not: "+primes);
                notPrimes.add(primes);
            }
        }
        //******************************************
        System.out.println();
        int minValueOne = 13;
        int minValueTwo = 67;
        NumberComparison numberComparison = new NumberComparison();
        numberComparison.minimumNumber(minValueOne, minValueTwo);
        //*****************************************
        Q11 q11 = new Q11();
        q11.simpleOutPut();
        //****************************************
        EvenNUmbers evenNUmbers = new EvenNUmbers();
        evenNUmbers.printEvenNumbers(100);
        //***************************************
        ConsoleTriangle consoleTriangle = new ConsoleTriangle();
        consoleTriangle.printTriangle();
        System.out.println();
        //**************************************
        int userPick = 2;
        SwitchSatement switchSatement = new SwitchSatement();
        switchSatement.switchChoice(userPick);
        //*************************************
        InterfaceMainClass interfaceMainClass = new InterfaceMainClass();
        interfaceMainClass.addition(1,2);
        interfaceMainClass.division(2,1);
        interfaceMainClass.subtraction(2,1);
        interfaceMainClass.division(4,2);
    }

}


package com.company;

public class NFactorial {

    public int computeFactorial(int factorial){
        if(factorial == 0)
            return 1;
        return factorial*computeFactorial(factorial-1);
    }
}

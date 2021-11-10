package com.company;

public class IsPrime {
    public boolean findingPrime(int value){
        if(value == 1 || value == 0) return false;
        if(value == 2) return true;


        //check if n is a multiple of 2
        if (value % 2 == 0) return false;

        //if not, then just check the odds
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0)
                return false;
        }
        return true;
    }
}

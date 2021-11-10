package com.company;

public class NumberComparison {
    public void minimumNumber(int valueOne, int valueTwo){
        System.out.println("The minimum value of "+valueOne+" and "+valueTwo+" is: ");
        int minVal = (valueOne < valueTwo) ? valueOne : valueTwo;
        System.out.println(minVal);
    }
}

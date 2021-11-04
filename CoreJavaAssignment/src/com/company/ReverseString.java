package com.company;

public class ReverseString {

    public String reverseString(String stringToBeReversed){
        char tempChar;
        String newString = "";
        for (int i = 0; i < stringToBeReversed.length(); i++){
            tempChar = stringToBeReversed.charAt(i);
            newString = tempChar+newString;
        }
        return newString;
    }
}

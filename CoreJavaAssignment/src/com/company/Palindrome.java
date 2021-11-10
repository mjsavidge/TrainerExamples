package com.company;


import javax.print.DocFlavor;

public class Palindrome {
    public boolean isPalidrome(String value){
        if(value == null || value.isEmpty()){
            return false;
        }
        return new StringBuilder(value).reverse().toString().equals(value);
    }
}

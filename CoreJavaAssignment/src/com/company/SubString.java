package com.company;

public class SubString {

    public String sub(String str, int index){
        char[] charrArray = str.toCharArray();
        char[] subStringArray = new char[index];

        for(int i = 0; i < index; i++){
            subStringArray[i] = charrArray[i];
        }
        return new String(subStringArray);
    }
}

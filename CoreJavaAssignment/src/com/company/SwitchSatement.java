package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SwitchSatement {

    public void switchChoice(int pick){
        int number = 144;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        switch (pick) {
            case 1:
                System.out.println("Square Root of Number: "+number + " is: "+ Math.sqrt(number));
                break;
            case 2:
                System.out.println(dateFormat.format(date));
                break;
            case 3: String myString = "I am learning Core Java";
                String[] spString = myString.split("");
                printArray(spString);
        }
    }

    private void printArray(String[] spString) {
        int n = spString.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(spString[i] + " ");
        }
        System.out.println();
    }
}

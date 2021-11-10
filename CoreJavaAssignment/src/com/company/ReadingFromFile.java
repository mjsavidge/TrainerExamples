package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main() throws IOException {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("CoreJavaAssignment/src/com/company/Q20File"));
            String line;
            while((line = reader.readLine()) != null){

                String[] data = line.split(":");

                System.out.println("Name: "+data[0]+" "+data[1]);
                System.out.println("Age: "+ data[2]+" years");
                System.out.println("State: "+ data[3]+" State");
                System.out.println("\n");
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            if(reader != null){
                reader.close();
            }
        }
    }
}

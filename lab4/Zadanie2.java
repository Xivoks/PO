package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie2 {
    public static int odczyt(String nazwa, char znak){
        int count=0;
        try {
            File fileToRead= new File(nazwa);
            Scanner readFile = new Scanner(fileToRead);
            while (readFile.hasNextLine()) {
                String text = readFile.nextLine();
                for(int i=0;i<text.length();i++)
                {
                    if(text.charAt(i)==znak)
                    {
                        count++;
                    }
                }
            }
            readFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        return count;
    }

}
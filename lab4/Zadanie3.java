package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie3 {
    public static int odczyt(String nazwa, String znak){
        int count=0;
        try {
            File fileToRead= new File(nazwa);
            Scanner readFile = new Scanner(fileToRead);
            while (readFile.hasNextLine()) {
                String text = readFile.nextLine();
                int lenStr=text.length(),lenSubStr=znak.length(),index=0;
                String temp;
                while(lenStr-index>=lenSubStr){
                    temp=text.substring(index,index+(lenSubStr));
                    if(temp.equals(znak))
                    {
                        count++;
                    }
                    index++;
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
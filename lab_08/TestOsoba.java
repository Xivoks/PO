package com.company;
import java.time.LocalDate;
import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"},LocalDate.of(1999,2,12),false, 50000,LocalDate.of(2012,10,12));
        ludzie[1] = new Student("Nowak", "informatyka",new String[]{"Małgorzata"},LocalDate.of(1980,12,21),true, 5.5);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            for(String x: p.getImie()) {
            System.out.print(x+" ");
            }

            System.out.print(p.getNazwisko()+" urodzony: "+p.getdataUrodzenia()+" płeć: ");
            if(p.getplec()){
                System.out.print("Kobieta ");
            }
            else
            {
                System.out.print("Mężczyzna ");
            }
            System.out.print(p.getOpis());
            System.out.println("");

        }
    }
}







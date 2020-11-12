package com.company;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra=new ArrayList<>();
        orkiestra.add(new Skrzypce("Skrzypcejakies", LocalDate.of(1990,8,30)));
        orkiestra.add(new Flet("Flecikjakis", LocalDate.of(2020,12,18)));
        orkiestra.add(new Skrzypce("Skrzypcejakiesinne", LocalDate.of(2010,12,17)));
        orkiestra.add(new Fortepian("Fortepian", LocalDate.of(2020,1,13)));
        orkiestra.add(new Fortepian("Fortepianelegancki", LocalDate.of(1991,11,14)));
        for(Instrument ins: orkiestra){
            System.out.print(ins.dzwiek()+" ");
            System.out.println(ins);
        }

    }
}

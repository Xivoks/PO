package com.company;

import java.time.LocalDate;

class Student extends Osoba
{
    public Student(String nazwisko, String kierunek, String[] imie, LocalDate dataUrodzenia, Boolean plec, Double Srednia)
    {
        super(nazwisko,imie,dataUrodzenia,plec);
        this.kierunek = kierunek;
        this.srednia=Srednia;
    }
    public String getKierunek(){
        return this.kierunek;
    }
    public Double getSrednia(){
        return  this.srednia;
    }


    public String getOpis()
    {
        return "kierunek studiów: " + kierunek + " średnia "+srednia;
    }

    private String kierunek;
    private Double srednia;
}


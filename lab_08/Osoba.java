package com.company;

import java.time.LocalDate;

abstract class Osoba
{
    public Osoba(String nazwisko, String[] imie, LocalDate dataUrodzenia, Boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imie=imie;
        this.dataUrodzenia=dataUrodzenia;
        this.plec=plec;

    }

    public abstract String getOpis();

    public String getNazwisko()
    {

        return nazwisko;
    }
    public String[] getImie()
    {

        return imie;
    }
    public LocalDate getdataUrodzenia(){
        return dataUrodzenia;
    }
    public Boolean getplec(){
        return plec;
    }

    private String nazwisko;
    private String[] imie;
    private LocalDate dataUrodzenia;
    private Boolean plec;
}
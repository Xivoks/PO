package com.company;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String[] imie, LocalDate dataUrodzenia, Boolean plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko,imie,dataUrodzenia,plec);
        this.pobory = pobory;
        this.dataZatrudnienia=dataZatrudnienia;
    }

    public double getPobory()
    {

        return pobory;
    }
    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją "+pobory+" zł "+" zatrudniony "+dataZatrudnienia);
    }

    private double pobory;
    private LocalDate dataZatrudnienia;

}
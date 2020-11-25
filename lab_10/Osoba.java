package pl.edu.uwm.obiektowe.s155130.kolo1;

import java.rmi.NoSuchObjectException;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;
    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
    public String toString(){
        return this.getClass().getSimpleName()+" ["+getNazwisko()+", "+getDataUrodzenia()+"]";
    }
    public boolean equals(Object x){
        Osoba per=(Osoba) x;
        return (per.nazwisko.equals(this.nazwisko)&&per.dataUrodzenia.equals(this.dataUrodzenia));
    }
    public int compareTo(Osoba per1){
        int compare_nazwisko=this.nazwisko.compareTo(per1.nazwisko);
        if(compare_nazwisko==0){
            return this.dataUrodzenia.compareTo(per1.dataUrodzenia);
        }
        return compare_nazwisko;
    }
}

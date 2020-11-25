package pl.edu.uwm.obiektowe.s155130.kolo1;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private double sredniaOcen;
    public Student(String nazwisko,LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }
    public String toString(){
        return this.getClass().getSimpleName()+" ["+this.getNazwisko()+", "+this.getDataUrodzenia().toString()+", "+this.sredniaOcen+"]";
    }
    public int compareTo(Osoba x){
        int tmp=super.compareTo((x));
        if((x instanceof Student) && (tmp==0)){
            return -(int)Math.ceil(this.sredniaOcen-((Student)x).sredniaOcen);
        }
        return tmp;
    }
}

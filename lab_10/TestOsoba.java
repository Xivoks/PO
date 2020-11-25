package pl.edu.uwm.obiektowe.s155130.kolo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args) {
        ArrayList<Osoba> grupa=new ArrayList<>();

        Osoba Janek=new Osoba("Brunow", LocalDate.of(1999,9,02));
        Osoba Jarek=new Osoba("Brunow", LocalDate.of(1980,10,14));
        Osoba Alfred=new Osoba("Kowalski",LocalDate.of(1975,10,2));
        Osoba Kamil=new Osoba("Nowak",LocalDate.of(1975,10,2));
        Osoba Krzysztof=new Osoba("JarzynazeSzczecina",LocalDate.of(1988,12,24));

        grupa.add(Janek);
        grupa.add(Jarek);
        grupa.add(Alfred);
        grupa.add(Kamil);
        grupa.add(Krzysztof);

//        for (Osoba x: grupa ) {
//            System.out.println(x);
//        }
//        System.out.println(" ");
//        Collections.sort(grupa);
//        for (Osoba x: grupa ) {
//            System.out.println(x);
//        }

        ArrayList<Osoba> studenci=new ArrayList<>();

        Osoba Janek1=new Student("Brunow", LocalDate.of(1999,9,02),4.5);
        Osoba Jarek2=new Student("Brunow", LocalDate.of(1980,10,14),4);
        Osoba Alfred3=new Student("Kowalski",LocalDate.of(1975,10,2),3);
        Osoba Kamil4=new Student("Nowak",LocalDate.of(1975,10,2),5);
        Osoba Krzysztof5=new Student("JarzynazeSzczecina",LocalDate.of(1988,12,24),6);

        studenci.add(Janek1);
        studenci.add(Jarek2);
        studenci.add(Alfred3);
        studenci.add(Kamil4);
        studenci.add(Krzysztof5);

        for (Osoba x: studenci ) {
            System.out.println(x);
        }
        System.out.println("");
        Collections.sort(studenci);
        for (Osoba x: studenci ) {
            System.out.println(x);
        }

    }
}

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args){
//########################zadanie1##############################
//        RachunekBankowy saver1=new RachunekBankowy(2000);
//        RachunekBankowy saver2=new RachunekBankowy(3000);
//
//        saver1.setRocznaStopaProcentowa(4);
//        saver1.obliczMiesieczneOdsetki();
//        saver2.setRocznaStopaProcentowa(4);
//        saver2.obliczMiesieczneOdsetki();
//        System.out.println(saver1.getSaldo());
//        System.out.println(saver2.getSaldo());
//        saver1.setRocznaStopaProcentowa(5);
//        saver1.obliczMiesieczneOdsetki();
//        saver2.setRocznaStopaProcentowa(5);
//        saver2.obliczMiesieczneOdsetki();
//        System.out.println(saver1.getSaldo());
//        System.out.println(saver2.getSaldo());
//########################zadanie2##############################
        IntegerSet a=new IntegerSet();
        IntegerSet b=new IntegerSet();

        a.insertElement(2);
        a.insertElement(3);
        a.insertElement(4);
        a.insertElement(5);
        a.insertElement(6);

        b.insertElement(2);
        b.insertElement(3);
        b.insertElement(4);
        b.insertElement(53);
        b.insertElement(63);
        System.out.println(a);
        System.out.println(b);

        System.out.println(IntegerSet.union(a,b));
        System.out.println(IntegerSet.intersection(a,b));


        a.deleteElement(5);
        a.deleteElement(6);


        b.deleteElement(53);
        b.deleteElement(63);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.toString().equals(b.toString()));
//################zad3##################################
        PracownikDemo1[] personel = new PracownikDemo1[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new PracownikDemo1("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new PracownikDemo1("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new PracownikDemo1("Antoni Tester", 40000, 2005, 3, 15);

        // zwiększ pobory każdego pracownika o 20%
        for (PracownikDemo1 e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (PracownikDemo1 e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

    }
}

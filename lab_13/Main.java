import java.util.*;

public class Main {

    public static void main(String[] args) {
//            ############# zad1
//        PriorityQueue<Zadanie1> temp = new PriorityQueue<Zadanie1>();
//        temp.add(new Zadanie1(10,"sprzatanie"));
//        temp.add(new Zadanie1(8,"zakupy"));
//        temp.add(new Zadanie1(2,"nauka"));
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Podaj polecenie: ");
//        String quote= scan.nextLine();
//
//        if (quote.equals("dodaj priorytet opis")){
//            System.out.println("Podaj priorytet: ");
//            int x= Integer.valueOf(scan.nextLine());
//            System.out.println("Podaj opis: ");
//            String y=scan.nextLine();
//            temp.add(new Zadanie1(x,y));
//        }
//        else if(quote.equals("następne")){
//            temp.remove();
//        }
//        else if(quote.equals("zakończ"))
//        {
//            System.exit(0);
//        }
//        for (Zadanie1 zadanie1 : temp)
//            System.out.println (zadanie1.toString() );
//        ################### zad2 ######################
//            Zadanie2Map tmp=new Zadanie2Map();
//            tmp.add(new Zadanie2("BDB","E"));
//            tmp.add(new Zadanie2("DST","F"));
//            tmp.add(new Zadanie2("BDB","Brunow"));
//            tmp.add(new Zadanie2("DB","C"));
//            tmp.add(new Zadanie2("DB-","D"));
//            System.out.println(tmp);
//
//            tmp.remove("F");
//            tmp.zmienOcene("DST","Brunow");
//            System.out.println(tmp);
//        ################# zad3
        StudentMap students = new StudentMap();
        students.add(new Student("Adam","Nowak",156031),"bdb");
        students.add(new Student("Ewa","Kowalska",221345),"dop");
        students.add(new Student("Joe","Smith",122022),"db");
        students.add(new Student("Carl","Wozniak",146032),"dop");
        students.add(new Student("James","Adobe",154022),"dst+");
        students.add(new Student("Anne","Adobe",245052),"dop+");
        students.add(new Student("Anne","Adobe",218802),"dop+");
        System.out.println(students);
        students.changeGrade(156031,"db-");
        students.changeGrade(122022,"dst+");
        System.out.println(students.getOcena(156031));
        System.out.println(students.getOcena(122022));
        System.out.println(students);
        students.remove(146032);
        System.out.println(students);
        }

     }



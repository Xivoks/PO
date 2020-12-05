import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mercedes");
        cars.add("Peugeot");
        cars.add("Opel");
//        System.out.println("Przed redukcją");
//        System.out.println(cars);
//        Zadania.redukuj(cars,2);
//        System.out.println("Po redukcji");
//        System.out.println(cars);
//        Zadania.odwroc(cars);
//        System.out.println(cars);

        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(5);
        integers.add(4);
        integers.add(6);
        integers.add(1);
        integers.add(3);
        integers.add(12);
        integers.add(18);
//        System.out.println("Przed redukcją");
//        System.out.println(integers);
//        Zadania.redukuj(integers,2);
//        System.out.println("Po redukcji");
//        System.out.println(integers);
//        Zadania.odwroc(integers);
//        System.out.println(integers);
        String x="Ala ma kota. Jej kot lubi myszy.";
//        System.out.println(Zadania.stos(x));

//        Zadania.liczby(2015);
//        Zadania.sitoEratonesa(20);
        Zadania.print(integers);
        Zadania.print(cars);
    }

}

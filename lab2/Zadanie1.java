import java.util.Scanner;
import java.lang.*;

public class Zadanie1 {
    public static int zadaniepierwsze(int n) {
        int wynik=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            wynik= wynik+number;
        }
        return wynik;
    }
    static int zadaniedrugie(int n){
        int wynik=1;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            wynik= wynik*number;
        }
        return wynik;
    }
    static int zadanietrzecie(int n){
        int wynik=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            wynik= wynik+Math.abs(number);
        }
        return wynik;
    }
    static double zadanieczwarte(int n){
        double wynik=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double number = input.nextInt();
            wynik= wynik+Math.sqrt(Math.abs(number));
        }
        return wynik;
    }
    static int zadaniepiate(int n){
        int wynik=1;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            wynik= wynik*Math.abs(number);
        }
        return wynik;
    }
    static double zadanieszoste(int n){
        double wynik=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            wynik= wynik+Math.pow(number,2);
        }
        return wynik;
    }
    public static String zadaniesiodme(int n){
        int wynik=0;
        int wynik1=1;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            wynik= wynik+number;
            wynik1=wynik1*number;
        }
        return "suma="+wynik+", wynik="+wynik1;
    }
    public static int zadanieosme(int n){
        int wynik=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            if(i%2==0)
            {
                wynik=wynik+number;
            }
            else
            {
                wynik=wynik-number;
            }
        }
        return wynik;
    }
    private static int silnia(int i)
    {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }
    static double zadaniedziewiec(int n)
    {
        double suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            suma=suma+(Math.pow(-1,i+1)*in.nextInt())/silnia(i);
        }
        return suma;
    }

        private static int[] przesuniecie(int n,int arr[]){
            Scanner liczby = new Scanner(System.in);
            int arr1[]=new int[n];
            for (int i=1;i<n;i++)
            {
                arr1[i-1]=arr[i];
            }
            arr1[n-1]=arr[0];
            return arr1;
        }
        static int zadanie2(int n){
            Scanner in = new Scanner(System.in);
            int arr[]=new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            for (int i=0;i<n;i++) {
                System.out.println(przesuniecie(n,arr)[i]);
            }
            return 0;
        }
}

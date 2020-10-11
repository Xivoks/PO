import java.util.Scanner;

public class Zadanie2 {
    static int zadaniepierwsze(int n){
        Scanner input = new Scanner(System.in);
        int wynik=0;
        for (int i = 0; i < n; i++) {
            int liczba = input.nextInt();
            if(liczba%2==1)
            {
                wynik++;
            }
        }
        return wynik;
    }
    static int zadaniedrugie(int n){
        Scanner input = new Scanner(System.in);
        int wynik=0;
        for (int i = 0; i < n; i++) {
            int liczba = input.nextInt();
            if(liczba%3==0 && liczba%5!=0)
            {
                wynik++;
            }
        }
        return wynik;
    }
    static int zadanietrzecie(int n){
        Scanner input = new Scanner(System.in);
        int wynik=0;
        for (int i = 0; i < n; i++) {
            int liczba = input.nextInt();
            if(Math.sqrt(liczba)%2==0)
            {
                wynik++;
            }
        }
        return wynik;
    }
    static double zadanieczwarte(int n){
        Scanner input=new Scanner(System.in);
        double arr[]=new double[n];
        double wynik=0;
        for(int i=1;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        for(int i=2;i<n-1;i++)
        {
            if(arr[i]<(arr[i-1]+arr[i+1])/2)
            {
                wynik++;
            }
        }
        return wynik;
    }

    static double zadaniepiate(int n){
        class Silnia {
            public double silnia(int i) {
                if (i == 0)
                    return 1;
                else
                    return i * silnia(i - 1);
            }
        }
        Silnia s = new Silnia();
        Scanner input=new Scanner(System.in);
        double arr[]=new double[n];
        double wynik=0;
        for(int i=1;i<n;i++)
        {
            arr[i]= input.nextInt();
            if(Math.pow(2,i)<arr[i] && arr[i]<s.silnia(i))
            {
                wynik++;
            }
        }
        return wynik;
    }
    static int zadanieszoste(int n){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[n];
        int wynik=0;
        for(int i=1;i<n;i++)
        {
            arr[i]= input.nextInt();
            if(i%2!=0 && arr[i]%2==0)
            {
                wynik++;
            }
        }
        return wynik;
    }
    static int zadaniesiodme(int n){
        Scanner input=new Scanner(System.in);
        int wynik=0;
        for(int i=0;i<n;i++)
        {
            int liczba= input.nextInt();
            if(liczba%2!=0 && liczba>=0)
            {
                wynik++;
            }
        }
        return wynik;
    }
    static int zadanieosme(int n){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[n];
        int wynik=0;
        for(int i=1;i<n;i++)
        {
            arr[i]= input.nextInt();
            if(Math.abs(arr[i])<Math.pow(i,2))
            {
                wynik++;
            }
        }
        return wynik;
    }
}

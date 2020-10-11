import java.util.Scanner;
public class Zadanie2_2 {
    static int zadaniedwa(int n){
        Scanner input=new Scanner(System.in);
        int wynik=0;
        for(int i=1;i<=n;i++)
        {
            int liczba= input.nextInt();
            if(liczba>=0)
            {
                wynik+=liczba*2;
            }
        }
        return wynik;
    }
    static int zadanietrzy(int n){
        Scanner input=new Scanner(System.in);
        int dodatnie=0;
        int zer=0;
        int ujemne=0;
        for(int i=1;i<=n;i++)
        {
            int liczba= input.nextInt();
            if(liczba>=0)
            {
                if(liczba>0) {
                    dodatnie ++;
                }
                else {
                    zer++;
                }
            }
            else
            {
                ujemne++;
            }

        }
        return ujemne;
    }
    static int zadaniecztery(int n){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        int najmniejsza=arr[0];
        int najwieksza=arr[0];
        for(int i=1;i<n;i++) {
            if(najwieksza<arr[i])
            {
                najwieksza=arr[i];
            }
            if(najmniejsza>arr[i])
            {
                najmniejsza=arr[i];
            }
        }
        return najwieksza;
    }
    static int zadaniepiec(int n) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[n];
        int licznik=0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if(arr[i-1]>0 && arr[i]>0)
            {
                licznik++;
            }
        }

        return licznik;
    }
}


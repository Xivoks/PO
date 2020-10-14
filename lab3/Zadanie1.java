import java.util.Random;
public class Zadanie1 {
    public static int zadaniepierwsze(int n){
        Random r = new Random();
        int arr[]=new int[n];
        int dodatnie=0;
        int ujemne=0;
        for(int i=0;i<n;i++) {
            arr[i]=r.nextInt(1999) - 999;
            if(arr[i]%2==0)
            {
                dodatnie++;
            }
            else
            {
                ujemne++;
            }
        }

        return dodatnie;
    }
    public static int zadaniedrugie(int n){
        Random r = new Random();
        int arr[]=new int[n];
        int dodatnie=0;
        int ujemne=0;
        int zero=0;
        for(int i=0;i<n;i++) {
            arr[i]=r.nextInt(1999) - 999;
            if(arr[i]>0)
            {
                dodatnie++;
            }
            else if(arr[i]<0)
            {
                ujemne++;
            }
            else
            {
                zero++;
            }
        }

        return ujemne;
    }
    public static int zadanietrzecie(int n){
        Random r = new Random();
        int arr[]=new int[n];
        int najwiekszy=arr[0];
        int powtorzenia=0;
        for(int i=0;i<n;i++) {
            arr[i] = r.nextInt(1999) - 999;
            if (arr[i] > najwiekszy) {
                najwiekszy = arr[i];
            }

        }
        for(int i=0;i<n;i++)
        {
            if(najwiekszy==arr[i])
            {
                powtorzenia++;
            }
        }
        return najwiekszy;
    }
    public static int zadanieczwarte(int n){
        Random r = new Random();
        int arr[]=new int[n];
        int dodatnie=0;
        int ujemne=0;
        for(int i=0;i<n;i++) {
            arr[i] = r.nextInt(1999) - 999;
            if (arr[i] >= 0) {
                dodatnie+=arr[i];
            }
            else{
                ujemne+=arr[i];
            }
        }
        return ujemne;
    }
    public static int zadaniepiate(int n){
        Random r = new Random();
        int arr[]=new int[n];
        int dodatnie=0;
        int wynik=0;
        for(int i=0;i<n;i++) {
            arr[i] = r.nextInt(1999) - 999;
            if (arr[i]> 0) {
                dodatnie++;
            }
            if(dodatnie>wynik)
            {
                wynik=dodatnie;
            }
            if(arr[i]<=0)
            {
                dodatnie=0;
            }
        }
        return wynik;
    }
    public static int zadanieszoste(int n){
        Random r = new Random();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = r.nextInt(1999) - 999;
           if(arr[i]<0)
           {
               arr[i]=-1;
           }
           else
           {
               arr[i]=1;
           }
           System.out.println(arr[i]);
        }
        return 0;
    }
    public static int zadaniesiodme(int n){
        Random r = new Random();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int lewy=1;
        int prawy=5;
        for(int i=0;i<n;i++) {
            arr[i] = r.nextInt(1999) - 999;
            arr1[i]=arr[i];
            System.out.println(arr[i]);
        }
        for(int i=0;i<prawy-lewy+1;i++) {
            arr1[lewy+i]=arr[prawy-i];
        }
        System.out.println("\n");
        for(int i=0;i<n;i++) {
            System.out.println(arr1[i]);
        }
        return 0;
    }

}

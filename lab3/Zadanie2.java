import java.util.Random;

public class Zadanie2 {
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
            System.out.println(tab[i]);
        }
    }

    public static int ileNieparzystych(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileParzystych(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileDodatnich(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileUjemnych(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileZerowych(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                wynik++;
            }
        }
        return wynik;
    }

    public static int ileMaksymalnych(int tab[]) {
        int najwiekszy = tab[0];
        int powtorzenia = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > najwiekszy) {
                najwiekszy = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (najwiekszy == tab[i]) {
                powtorzenia++;
            }
        }
        return powtorzenia;
    }

    public static int sumaDodatnich(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                wynik += tab[i];
            }
        }
        return wynik;
    }

    public static int sumaUjemnych(int tab[]) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                wynik += tab[i];
            }
        }
        return wynik;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int dodatnie = 0;
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                dodatnie++;
            }
            if (dodatnie > wynik) {
                wynik = dodatnie;
            }
            if (tab[i] <= 0) {
                dodatnie = 0;
            }
        }
        return wynik;
    }
    public static int signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]<0)
            {
                tab[i]=-1;
            }
            else
            {
                tab[i]=1;
            }
            System.out.println(tab[i]);
        }
        return 0;
    }
    public static int odwrocFragment(int tab[], int lewy, int prawy) {
        int len=tab.length;
        int arr1[]=new int[len];
        for (int i = 0; i < tab.length; i++) {
            arr1[i]=tab[i];
        }
        for(int i=0;i<prawy-lewy+1;i++) {
            arr1[lewy+i]=tab[prawy-i];
        }
        System.out.println("\n");
        for(int i=0;i<len;i++) {
            System.out.println(arr1[i]);
        }
        return 0;
    }
}

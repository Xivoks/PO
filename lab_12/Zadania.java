import java.util.*;
import java.util.function.Predicate;

public class Zadania {
    public static <T> void redukuj(LinkedList <T> pracownicy, int n){
        for (int i = 0; i <pracownicy.size()-1 ; i+=n) {
            pracownicy.remove(i);
        }
    }
    public static <T> void odwroc(LinkedList<T> lista){
        Collections.reverse(lista);
    }
    public static String stos(String zdanie){
        String[] slowa=zdanie.split(" ");
        Stack<String> stosik=new Stack<>();
        StringBuilder odwroc=new StringBuilder();
        for(String x: slowa){
            stosik.push(x);
            if(x.endsWith(".")){
                while (!stosik.empty()){
                    StringBuilder slowo_odwrocone=new StringBuilder();
                    slowo_odwrocone.append(stosik.pop());
                    if(stosik.empty()){
                        slowo_odwrocone.setCharAt(0,Character.toLowerCase(slowo_odwrocone.charAt(0)));
                        odwroc.append(slowo_odwrocone);
                        odwroc.append(". ");
                    }
                    else if(slowo_odwrocone.toString().equals(x)){
                        slowo_odwrocone.setCharAt(0,Character.toUpperCase(slowo_odwrocone.charAt(0)));
                        odwroc.append(slowo_odwrocone, 0, slowo_odwrocone.length()-1);
                        odwroc.append(" ");
                    }
                    else{
                        odwroc.append(slowo_odwrocone);
                        odwroc.append(" ");
                    }
                }

            }
        }
        return odwroc.toString();
    }
    public static void liczby(int n){
        Stack<Integer> cyfrowy_stos=new Stack<>();
        while (n!=0){
            cyfrowy_stos.push(n%10);
            n/=10;
        }
        while (!cyfrowy_stos.empty()){
            System.out.print(cyfrowy_stos.pop()+" ");
        }
    }
    public static void sitoEratonesa(int n){
        ArrayList<Integer> pierwsze = new ArrayList<Integer>();
        for (int i = 2; i <n+1 ; i++) {
            pierwsze.add(i);
        }
        Predicate<Integer> predicate = s -> s!=3 && s%3==0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            pierwsze.removeIf(predicate);
            int FinalneI = i;
            predicate= s -> s!=FinalneI && s%FinalneI==0;

        }
        System.out.println(pierwsze);
    }
    public static <T extends Iterable<?>> void print(T object ){
        Iterator<?> temp= object.iterator();
        while (temp.hasNext()){
            System.out.print(temp.next());
            if (temp.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

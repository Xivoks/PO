import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PairDemo1 {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());
//        mm.swap();
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());
//   zad2
//        Pair<String> kappa=PairUtil.swap(mm);
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());
//
//        System.out.println("min = " + kappa.getFirst());
//        System.out.println("max = " + kappa.getSecond());
//   zad3
        ArrayList<Integer> checkInt=new ArrayList<>();
        checkInt.add(99);
        checkInt.add(2);
        checkInt.add(1);
        checkInt.add(4);
        checkInt.add(5);
        checkInt.add(7);
//        Collections.sort(checkInt);
        System.out.println(ArrayUtil.isSorted(checkInt));
        System.out.println(ArrayUtil.binarySearch(checkInt,2)); //zad4
        ArrayUtil.selectionSort(checkInt); //zad5
        ArrayUtil.mergeSort(checkInt); //zad6

        ArrayList<LocalDate> checkLocalDate=new ArrayList<>();
        checkLocalDate.add(LocalDate.of(1990,1,20));
        checkLocalDate.add(LocalDate.of(1876,12,13));
        checkLocalDate.add(LocalDate.of(1985,5,24));
        checkLocalDate.add(LocalDate.of(1965,4,5));
        checkLocalDate.add(LocalDate.of(1987,12,24));
//        Collections.sort(checkLocalDate);
        System.out.println(ArrayUtil.isSorted(checkLocalDate));
        System.out.println(ArrayUtil.binarySearch(checkLocalDate,LocalDate.of(1990,1,20))); //zad4
        ArrayUtil.selectionSort(checkLocalDate); //zad5
        ArrayUtil.mergeSort(checkLocalDate); //zad6



    }
}

class ArrayAlg {

    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<String> (min, max);
    }
}


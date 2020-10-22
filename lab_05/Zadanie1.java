import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Zadanie1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer>b){
        ArrayList<Integer> lista=new ArrayList<>();
        lista.addAll(a);
        lista.addAll(b);
        return lista;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista=new ArrayList<>();
        int alen=a.size();
        int blen=b.size();
        int i=0;
        int k=Math.min(alen,blen);
        for (int j = 0; j < k; j++) {
            lista.add(a.get(i));
            lista.add(b.get(i));
            i++;
        }
        if(alen>blen)
        {
            for (int j = k; j <alen ; j++) {
                lista.add(a.get(j));
            }
        }
        else
        {
            for (int j = k; j <blen ; j++) {
                lista.add(b.get(j));
            }
        }
        return lista;
    }
   public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
       ArrayList<Integer> lista = new ArrayList<>();
       Collections.sort(a);
       Collections.sort(b);

       int i=0;
       int j=0;
       for (int k = 0; k <a.size()+b.size() ; k++) {
              if(i<a.size()&&j<b.size()) {
                  if (a.get(i) > b.get(j)) {
                      lista.add(b.get(j));
                      j = j + 1;
                  } else {
                      lista.add(a.get(i));
                      i = i + 1;
                  }
              }else if(i<a.size()){
                  lista.add(a.get(i));
                  i = i + 1;
              }
              else
              {
                  lista.add(b.get(j));
                  j = j + 1;
              }
       }
       return lista;
   }
   public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> list=new ArrayList<>();
        int alen=a.size();
       for (int i = alen-1; i >= 0; i--) {
           list.add(a.get(i));
       }
       return list;
   }
   public static void reverse(ArrayList<Integer> a){
       ArrayList<Integer> list=new ArrayList<>(a);
       int alen=0;
       for (int i =list.size()-1; i >= 0; i--) {
           a.set(alen,list.get(i));
           alen++;
       }
   }

}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>>boolean isSorted(ArrayList<T> list){
        ArrayList<T> newList=new ArrayList<>(list);
        Collections.sort(newList);
        return list.equals(newList);
    }
    public static <T extends Comparable<?super T>> int binarySearch(ArrayList<T> list,T wanted){
        if(ArrayUtil.isSorted(list)) {
            int first=0;
            int last=list.size()-1;
            while (first<=last) {
                int mid=(first+last)/2;
                if(list.get(mid).compareTo(wanted)==0) {
                    return mid;
                }
                else if(list.get(mid).compareTo(wanted)>0){
                    last=mid-1;
                }
                else if(list.get(mid).compareTo(wanted)<0)
                {
                    first=mid+1;
                }
            }
        }
        return -1;
        }
    public static <T extends Comparable<?super T>> void selectionSort(ArrayList<T> list) {
        int len=list.size();
        T tmp;
        for (int i = 0; i < len-1; i++) {
            int min_idx=i;
            for (int j = i+1; j < len; j++) {
                if(list.get(j).compareTo(list.get(min_idx))>0){
                    min_idx=j;
                }

            }
            tmp=list.get(min_idx);
            list.set(min_idx,list.get(i));
            list.set(i,tmp);

        }
        Collections.reverse(list);
    }
    public static <T extends Comparable<?super T>> void mergeSort(ArrayList<T> list) {
        if (list.size() > 1) {
            ArrayList<T> l = new ArrayList<>();
            ArrayList<T> r = new ArrayList<>();
            boolean logicalSwitch = true;
            while (!list.isEmpty()) {
                if (logicalSwitch) {
                    l.add(list.remove(0));
                } else {
                    r.add(list.remove(list.size()/2));
                }
                logicalSwitch = !logicalSwitch;
            }
            mergeSort(l);
            mergeSort(r);
            while (!l.isEmpty() && !r.isEmpty()) {
                if(l.get(0).compareTo(r.get(0)) <= 0){
                    list.add(l.remove(0));
                }
                else {
                    list.add(r.remove(0));
                }
            }
            if(!l.isEmpty()){
                list.addAll(l);
            }
            else if (!r.isEmpty()){
                list.addAll(r);
            }
        }
    }

}


public class PairUtil<T>{
    public static <T> Pair<T> swap(Pair<T> mm){
       Pair<T> para=new Pair<>(mm.getFirst(), mm.getSecond());
       para.swap();
       return para;
    }
}

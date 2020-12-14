import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
public class Zadanie2Map implements Comparable<Zadanie2Map> {
    HashMap<String,String> tmp=new HashMap<>();
    public Zadanie2Map(){

    }
    public void add(Zadanie2 o){
        tmp.put(o.getNazwisko(),o.getOcena());
    }
    public void remove(String nazwisko){
        this.tmp.remove(nazwisko);
    }
    public void zmienOcene(String nowaOcena, String nazwisko){
        this.tmp.replace(nazwisko,nowaOcena);
    }
    public String getOcena(String nazwisko){
        return tmp.get(nazwisko);
    }
    @Override
    public boolean equals(Object o){
        if ( o instanceof Zadanie2Map) return this.compareTo((Zadanie2Map) o)==0;
        return false;
    }
    @Override
    public int compareTo(Zadanie2Map o) {
        return this.hashCode()-o.hashCode();
    }
    @Override
    public String toString(){
        StringBuilder stringReturn = new StringBuilder();
        final List<String> allKeys = new ArrayList<>(tmp.keySet());
        final String separator = ": ";
        Collections.sort(allKeys);
        for (final String key: allKeys){
            final String value = tmp.get(key)+"\n";
            stringReturn.append(key);
            stringReturn.append(separator);
            stringReturn.append(value);

        }
        return stringReturn.toString();
    }
    private static String getKeyValue(final Map<String, String> map){
        final StringBuilder KeyValuePair = new StringBuilder();

        final String KeyValueSeparator = "=";
        final String listSeparator = "^";

        if (map != null){
            final List<String> allKeys = new ArrayList<>(map.keySet());
            Collections.sort(allKeys);

            for (final String key: allKeys){
                final String value = map.get(key);
                KeyValuePair.append(listSeparator);
                KeyValuePair.append(key);
                KeyValuePair.append(KeyValueSeparator);
                KeyValuePair.append(null == value?"": value);
            }
        }
        return 0 == KeyValuePair.length() ? "" : KeyValuePair.substring(listSeparator.length());
    }
}

import java.util.Objects;
class Zadanie2 implements Comparable<Zadanie2>
{
    private String ocena;
    private String nazwisko;

    public Zadanie2()
    {
        ocena = "";
        nazwisko = "";
    }

    public Zadanie2(String ocena, String nazwisko)
    {
        this.ocena = ocena;
        this.nazwisko = nazwisko;
    }

    public String getOcena()
    {
        return ocena;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setOcena(String ocena)
    {
        this.ocena = ocena;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Zadanie2 student = (Zadanie2) o;
        return Objects.equals(nazwisko,student.nazwisko) &&
                Objects.equals(ocena,student.ocena);
    }
    @Override
    public int compareTo(Zadanie2 o) {
        int result=0;
        if(getNazwisko().compareTo(o.getNazwisko())>0){
            result=1;
        }
        if(getNazwisko().compareTo(o.getNazwisko())<0){
            result=-1;
        }
        return result;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nazwisko,ocena);
    }
    @Override
    public String toString()
    {
        return nazwisko+": "+ocena;
    }

}

import java.util.Objects;
public class Student implements Comparable<Student> {
    private int id;
    private String nazwisko;
    private String imie;

    public Student()
    {
        id = 0;
        nazwisko = "";
        imie="";
    }

    public Student(String imie, String nazwisko,int id)
    {
        this.imie=imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getImie()
    {
        return imie;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public void setImie(String imie)
    {
        this.imie = imie;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(nazwisko,student.nazwisko) && Objects.equals(imie,student.imie);
    }
    @Override
    public int compareTo(Student o) {
        int result=0;
        if(getNazwisko().compareTo(o.getNazwisko())>0){
            result=1;
        }
        if(getNazwisko().compareTo(o.getNazwisko())<0){
            result=-1;
        }
        if(result==0){
            if(getImie().compareTo(o.getImie())>0){
                result=1;
            }
            if(getImie().compareTo(o.getImie())<0){
                result=-1;
            }
        }
        return result;
    }
    public int hashCode(){
        return Objects.hash(nazwisko,imie,id);
    }
    @Override
    public String toString()
    {
        return nazwisko+" "+imie+" "+id;
    }

}

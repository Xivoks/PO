package pl.imiajd.brunow;

public class Student extends Osoba {
    private String Kierunek;
    public Student(String Kierunek, String Nazwisko, String RokUrodzenia){
        super(Nazwisko,RokUrodzenia);
        this.Kierunek=Kierunek;
    }
    @Override
    public String toString(){
        return super.toString()+String.format(" jest na kierunku: "+Kierunek);
    }
    public String get_Kierunek(){
        return this.Kierunek;
    }
    public String get_Nazwisko(){
        return super.get_Nazwisko();
    }
    public String get_RokUrodzenia(){
        return super.get_RokUrodzenia();
    }
}

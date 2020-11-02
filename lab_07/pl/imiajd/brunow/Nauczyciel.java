package pl.imiajd.brunow;

public class Nauczyciel extends Osoba {
    private String Pensja;
    public Nauczyciel(String Pensja,String Nazwisko,String RokUrodzenia){
        super(Nazwisko,RokUrodzenia);
        this.Pensja=Pensja;
    }
    @Override
    public String toString(){
        return super.toString()+String.format(" zarabia: "+Pensja);
    }
    public String get_Pensja(){
        return this.Pensja;
    }
    public String get_Nazwisko(){
        return super.get_Nazwisko();
    }
    public String get_RokUrodzenia(){
        return super.get_RokUrodzenia();
    }
}

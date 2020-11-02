package pl.imiajd.brunow;

public class Osoba {
    private String Nazwisko;
    private String RokUrodzenia;
    public Osoba(String Nazwisko,String RokUrodzenia){
        this.RokUrodzenia=RokUrodzenia;
        this.Nazwisko=Nazwisko;
    }
    @Override
    public String toString(){
        return super.toString()+String.format(Nazwisko+" urodził sie w: "+RokUrodzenia);
    }
    public String get_Nazwisko(){
        return this.Nazwisko;
    }
    public String get_RokUrodzenia(){
        return this.RokUrodzenia;
    }
}

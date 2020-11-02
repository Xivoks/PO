package pl.imiajd.brunow;

public class Adres {
    private String ulica;
    private String numer_mieszkania;
    private String numer_domu;
    private String miasto;
    private String kod_pocztowy;
    public Adres(String ulica1,String numer_mieszkania1,String numer_domu1,String miasto1,String kod_pocztowy1) {
        this.ulica=ulica1;
        this.numer_domu=numer_domu1;
        this.numer_mieszkania=numer_mieszkania1;
        this.miasto=miasto1;
        this.kod_pocztowy=kod_pocztowy1;
    }
    public Adres(String ulica1,String numer_domu1,String miasto1,String kod_pocztowy1) {
        this.ulica = ulica1;
        this.numer_domu = numer_domu1;
        this.miasto = miasto1;
        this.kod_pocztowy = kod_pocztowy1;
    }
    public void Pokaz(){
        System.out.println(this.kod_pocztowy+" "+this.miasto);
        if(this.numer_mieszkania!=null)
        {
            System.out.println(this.ulica+" "+this.numer_mieszkania+"/"+this.numer_domu);
        }
        else
        {
            System.out.println(this.ulica+"/"+this.numer_domu);
        }

    }
    public boolean przed(String kod_pocztowy2){
        return kod_pocztowy2.equals(kod_pocztowy);
    }

}


package pl.imiajd.brunow;

public class Main {

    public static void main(String[] args) {
//	Adres adres1=new Adres("Zbigniewa Herberta","123","2","Olsztyn","80-100");
//	Adres adres2=new Adres("Zbigniewa Gilberta","321","1","Kraków","80-100");
//    System.out.println(adres2.przed("80-110"));
//
//    Osoba czlowek=new Osoba("Kapibar","1980");
//    Student uczen=new Student("Isi","Kak","1999");
//    Nauczyciel historii=new Nauczyciel("2200","Brunhilda","1960");
//    System.out.println(uczen.toString());
//    System.out.println(historii.get_Pensja());
        BetterRectangle kwadracik_pole=new BetterRectangle();
        kwadracik_pole.width=4;
        kwadracik_pole.height=4;
        System.out.println(kwadracik_pole.getArea());
        System.out.println(kwadracik_pole.getPerimeter());
        BetterRectangle prosto_pole=new BetterRectangle();
        prosto_pole.width=4;
        prosto_pole.height=8;
        System.out.println(prosto_pole.getArea());
        System.out.println(prosto_pole.getPerimeter());
    }
}

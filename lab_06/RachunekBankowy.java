public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double n){
        this.saldo=n;
    }
    public void obliczMiesieczneOdsetki(){
        this.saldo+=(this.saldo*rocznaStopaProcentowa)/12;
    }
    public void setRocznaStopaProcentowa(double n){
        rocznaStopaProcentowa=n;
    }
    public double getSaldo() {
        return this.saldo;
    }
}

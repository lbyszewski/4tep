package olsztyn.zseit.com.fraction.encapsulation;

public class Fraction {
    private double licznik;
    private double mianownik;


    public Fraction(double licznik, double mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }


    public double getLicznik() {
        return licznik;
    }

    public void setLicznik(double licznik) {
        this.licznik = licznik;
    }

    public double getMianownik() {
        return mianownik;
    }

    public void setMianownik(double mianownik) {
        this.mianownik = mianownik;
    }


    public double mulpTwoNumbers(){
       double result =  this.getLicznik() * this.getMianownik();
       return result;
    }
}

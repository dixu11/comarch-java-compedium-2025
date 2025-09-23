package fundamenty;

import java.math.BigDecimal;

public class Sklep {
    public static void main(String[] args) {
        //typ nazwa;
        char litera;
        //typ nazwa = wartosc;
        char litera2 = 'a';
        System.out.println(litera2);
        litera2 = 'b';
        System.out.println(litera2);
        litera = litera2;
        System.out.println(litera);

        //8 typów zmiennych prymitywnych
        //liczby całkowite
        //byte short int long
        //liczby dziesiętne
        //float double
        // char - jeden znak
        // boolean - wartość logincza true false

        //typy referencyjne
        String text = "Oferta: rower górski. Cena 1300zł";


        System.out.println(1200.9);

        double cenaRoweru = 1200;
        //specjalny typ wykorzystujący mechanizmy obiektowe aby nie mieć żadnych strat wynikających z ograniczenia pamięci dla liczb.
        BigDecimal cena2 = new BigDecimal("10.55555555111111111232323232323232323");

        int iloscRat = 24;
        System.out.println("Oferta: rower górski. " + cenaRoweru + "zł");
        System.out.println("Raty: " + iloscRat);
        double kwotaRaty = cenaRoweru / iloscRat;
        System.out.println("Cena za ratę: " + kwotaRaty + "zł");
        System.out.println("Raty z podatkiem 7%: " + kwotaRaty * 1.07 + "zł");


        System.out.println(2 + 2);
        double kwotaBonusy = 1000;
        boolean bonus = cenaRoweru > kwotaBonusy;


        //System.out.println("Bonus za wydatek " + kwotaBonusy + "zł:" + bonus);
        String bonusText = "Bonus za wydatek " + kwotaBonusy + "zł: ";
        String bonusLabel;
        if(bonus){
            bonusLabel = "tak";
        }else{
            bonusLabel = "nie";
        }
        System.out.println(bonusText + bonusLabel);

        if (bonus) {
            System.out.println("Wysyłam!");
        }

    }
}

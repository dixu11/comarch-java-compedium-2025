package obiektowe.poczta;

import java.util.Random;

public class Paczka {
    //Paczki mogą mieć nadawcę,
    // odbiorcę oraz wagę,
    // wyrażoną z dokładnością do gramów.
    //Mogą również być priorytetowe lub nie, domyślnie nie są.

    private String nadawca;
    private String odbiorca;
    private int wagaWGramach;
    private boolean priorytetowa = false;

//    Tworząc paczkę trzeba podać nadawcę, odbiorcę oraz jej wagę.



    /*
        * Konstruktor powinien skontrolować te wartości i wyświetlić
        *  błąd jeśli:
    adresat lub nadawca nie został podany
    waga nie mieści się w zakresie 1- 1000. */
    public Paczka(String nadawca, String odbiorca, int wagaWGramach) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        if (nadawca == null || nadawca.isBlank() || odbiorca == null || odbiorca.isBlank()) {
            System.err.println("Nie podano nadawcy lub odbiorcy!");
        }
        this.wagaWGramach = wagaWGramach;
        if (wagaWGramach < 1 || wagaWGramach > 5000) {
            System.err.println("Niepoprawna waga, ma być między 1 a 1000");
        }
    }

    //Przygotuj drugi alternatywny sposób tworzenia paczek (👉konstruktor), który będzie losował imię nadawcy,
    // imię odbiorcy, wagę paczki i to czy jest ona priorytetowa czy nie.
    public Paczka(){
        nadawca = getRandomName();
        odbiorca = getRandomName();
        Random random = new Random();
        wagaWGramach = random.nextInt(1, 5001);
        priorytetowa = random.nextBoolean();
    }

    private String getRandomName() {
        String[] names = {"Ala", "Ania", "Adam", "Kuba", "Kasia", "Zenon", "Zofia"};
        return names[ new Random().nextInt(names.length)];
    }

/*    rzygotuj również metodę pozwalającą wyliczyć i zwrócić cenę paczki,
 która zostanie wyliczona na podstawie jej parametrów:
    paczka do 0.5 kg  kosztuje 5 zł
do 1kg kosztuje 8zł
do 2 kg kosztuje 12 zł
    powyżej 2kg doliczane jest 1 zł za każdy kilogram
    paczka kosztuje 10% drożej jeśli jest priorytetowa*/

    public double getPrice(){
        double price;
        if (wagaWGramach < 500) {
            price = 5;
        } else if (wagaWGramach < 1000) {
            price = 8;
        } else if (wagaWGramach < 2000) {
            price = 12;
        } else {
            price = 12 + (wagaWGramach - 2000)/1000.0;
        }
        if (priorytetowa) {
            price *= 1.1;
        }
        return price;
    }


    @Override
    public String toString() {
        return "Paczka{" +
                "nadawca='" + nadawca + '\'' +
                ", odbiorca='" + odbiorca + '\'' +
                ", wagaWGramach=" + wagaWGramach +
                ", priorytetowa=" + priorytetowa +
                ", cena=" + getPrice() +
                '}';
    }
}

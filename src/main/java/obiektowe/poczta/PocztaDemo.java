package obiektowe.poczta;

/*
*
Poczta part 1

Zaprojektuj i przetestuj nowy, referencyjny typ danych: Paczka.
Paczki mogą mieć nadawcę, odbiorcę oraz wagę, wyrażoną z dokładnością do gramów.
Mogą również być priorytetowe lub nie, domyślnie nie są.
Tworząc paczkę trzeba podać nadawcę, odbiorcę oraz jej wagę.

Konstruktor powinien skontrolować te wartości i wyświetlić błąd jeśli:
adresat lub nadawca nie został podany
waga nie mieści się w zakresie 1- 1000.

skontroluj, czy cechy paczek ustawiają się poprawnie


Przygotuj drugi alternatywny sposób tworzenia paczek (👉konstruktor), który będzie losował imię nadawcy, imię odbiorcy, wagę paczki i to czy jest ona priorytetowa czy nie.

Przygotuj również metodę pozwalającą wyliczyć i zwrócić cenę paczki, która zostanie wyliczona na podstawie jej parametrów:
paczka do 0.5 kg  kosztuje 5 zł
do 1kg kosztuje 8zł
do 2 kg kosztuje 12 zł
powyżej 2kg doliczane jest 1 zł za każdy kilogram
paczka kosztuje 10% drożej jeśli jest priorytetowa

manipulacje zmiennymi:
Przygotuj w main dwie zmienne z paczkami
Stwórz jedną zmienną bez paczki, zainicjowaną wartością null.
Sprawdź cenę paczek wykorzystując te 3 zmienne.
Napisz instrukcję, która wstawi pierwszą paczkę do trzeciej zmiennej i zastąpi nulla
wyświetl cenę paczki w trzeciej zmiennej
 Przetestuj co się stanie jeśli ustawisz wszystkie zmienne jako “final”.

*
*
* */

public class PocztaDemo {
    public static void main(String[] args) {
        String pusty1;
        String pusty2 = "";
        String pusty3 = "   ";
        String pusty4 = null;

        //System.out.println(pusty1.concat("aaa".toUpperCase()));
//        System.out.println(pusty2.concat("aaa".toUpperCase()));
//        System.out.println(pusty3.concat("aaa".toUpperCase()));
//        System.out.println(pusty4);
//        System.out.println(pusty4.concat("aaa".toUpperCase()));


        Paczka paczka1 = new Paczka(null, "Jola", 10000);
        Paczka paczka2 = new Paczka();
        System.out.println(paczka1);
        System.out.println(paczka2);
    }
}

package obiektowe.poczta;

/*
* Tablice paczek

Przygotuj w main tablicę 3 paczek
uzupełnij ją paczkami
wyświetl dane pierwszej  paczki z tablicy.

Stwórz tablicę 100 paczek
 uzupełnij ją losowymi paczkami
.Osobną pętlą wyświetl wszystkie wylosowane paczki z tablicy (👉for each)
Wyświetl również łączną cenę wysłania tych paczek.

Rozbudowa programu

Dodaj do typu Paczka nową cechę status.
domyślnie ma być on ustawiony na “utworzona”
Przygotuj nowy typ danych: Poczta.

zachowania poczty

Do poczty dodaj metodę, która pozwoli nam nadawać paczki
Metoda ma wymagać przekazania paczki oraz kwoty pieniędzy
Metoda przyjmując paczkę powinna sprawdzić jej cenę, i jeśli zapłacono wystarczającą ilość pieniędzy ma zmienić jej status na “nadana” oraz zwrócić resztę.
Jeśli przekazano zbyt małą kwotę ma zwrócić tę kwotę i nie modyfikować stanu paczki.
Na koniec dodaj do poczty pole “utarg” i dodawaj do niego zarobione przez pocztę pieniądze.

Dodaj metodę pozwalającą na stworzenie i zwrócenie paczki
Ma ona zapytać w konsoli o wszystkie parametry paczki i stworzyć ją jako obiekt
na koniec zwróć utworzoną paczkę

W mainie spróbuj wykorzystać nową metodę do wytworzenia paczki
nadaj ją przy pomocy poprzedniej metody do nadawania paczek
*
* Adres

Przygotuj nowy typ danych Adres.
Adres powinien zawierać cechy takie jak: ulica, numer domu oraz kod pocztowy.
Tworząc obiekt adres należy przekazać wszystkie dane przez konstruktor.

List

Przygotuj typ List.
List powinien zawierać adres nadawcy, adres odbiorcy oraz może być priorytetowy lub nie.
Podobnie jak paczka powinien zawierać pole status które domyślnie ustawione jest na “nienadany”.
Aby stworzyć list należy przekazać adres nadawcy, i adres odbiorcy (jako obiekt typu Adres).
Przetestuj obiekt typu Adres tworząc  List i wyświetlając go w main.

Dodaj metodę zwracającą cenę listu.
Jeśli list jest priorytetowy, kosztuje 8,50zł jeśli nie, 6 zł.

Wysyłanie listów

Od teraz każda poczta ma posiadać pustą tablicę listów (pole), do której jest w stanie zmieścić 10 listów.

Przygotuj metodę nadawania listów
 która będzie działała podobnie do tej nadającej paczki z tym, że jeśli list został poprawnie opłacony powinien trafić na pierwsze wolne miejsce w tablicy
Jeśli tablica jest pełna metoda powinna wyświetlić, “przepraszamy, poczta jest w stanie wysyłać tylko 10 listów dziennie, i co nam zrobisz?”, chyba, że masz pomysł jak inaczej rozwiązać ten problem :)

Dodaj do poczty możliwość wysłania listonosza
Metoda ta ma ustawić status wszystkich listów na “wysłany”.

*
* */

import java.util.Arrays;

public class PocztaDemo2 {
    public static void main(String[] args) {
        Paczka paczka1 = new Paczka("Daniel", "Jola", 10000);
        Paczka paczka2 = new Paczka();

        /*Stwórz tablicę 100 paczek
 uzupełnij ją losowymi paczkami
.Osobną pętlą wyświetl wszystkie wylosowane paczki z tablicy (👉for each)
Wyświetl również łączną cenę wysłania tych paczek. */

        Paczka[] paczki = new Paczka[100];
        for (int i = 0; i < paczki.length; i++) {
            paczki[i] = new Paczka();
        }

        System.out.println(Arrays.toString(paczki));
        double cena = 0;
        for (Paczka paczka : paczki) {
            cena += paczka.getPrice();
        }
        System.out.println("Łączna cena: " + cena);


        Poczta poczta = new Poczta();
        double reszta1 = poczta.nadajPaczke(paczka1, 12);
        double reszta2 = poczta.nadajPaczke(paczka2, 12);
        System.out.println("Reszta:");
        System.out.println(reszta1);
        System.out.println(reszta2);
        System.out.println(paczka1);
        System.out.println(paczka2);
        System.out.println(poczta);

        System.out.println("---------------------");
        System.out.println("Tworzenie paczki z poziomu poczty");
        Paczka paczkaZPoczty = poczta.stworzPaczke();
        poczta.nadajPaczke(paczkaZPoczty, 20);
        System.out.println(paczkaZPoczty);
        System.out.println(poczta);
    }
}

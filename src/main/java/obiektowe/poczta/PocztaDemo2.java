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
    }
}

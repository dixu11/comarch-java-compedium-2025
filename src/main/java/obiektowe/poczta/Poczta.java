package obiektowe.poczta;

import obiektowe.Status;

import java.util.Arrays;
import java.util.Scanner;

public class Poczta {

    private double utarg = 0;
    private List[] listy = new List[10];
  /*  Do poczty dodaj metodę, która pozwoli nam nadawać paczki
    Metoda ma wymagać przekazania paczki oraz kwoty pieniędzy
    Metoda przyjmując paczkę powinna sprawdzić jej cenę, i jeśli zapłacono wystarczającą ilość pieniędzy ma zmienić jej status na “nadana” oraz zwrócić resztę.
    Jeśli przekazano zbyt małą kwotę ma zwrócić tę kwotę i nie modyfikować stanu paczki.
    Na koniec dodaj do poczty pole “utarg” i dodawaj do niego zarobione przez pocztę pieniądze.
*/

    /*
    * Dodaj metodę pozwalającą na stworzenie i zwrócenie paczki
Ma ona zapytać w konsoli o wszystkie parametry paczki i stworzyć ją jako obiekt
na koniec zwróć utworzoną paczkę
    * */

   /* Paczka stworzPaczke(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wagę w gramach:");
        int waga = scanner.nextInt();
        scanner.nextLine();
//        scanner = new Scanner(System.in);
        System.out.print("Podaj odbiorcę:");
        String odbiorca = scanner.nextLine();
        System.out.print("Podaj nadawcę:");
        String nadawca = scanner.nextLine();
        return new Paczka(odbiorca,nadawca,waga);
    }*/

    Paczka stworzPaczke(){
        BetterScanner scanner = new BetterScanner();
        int waga = scanner.readNumber("Podaj wagę w gramach:");
        String odbiorca = scanner.readText("Podaj odbiorcę:");
        String nadawca = scanner.readText("Podaj nadawcę:");
        return new Paczka(odbiorca,nadawca,waga);
    }




    double nadajPaczke(Paczka paczka, double kwota){
        if (kwota >= paczka.getPrice()) {
            paczka.setStatus("nadana");
            utarg += paczka.getPrice();
            return kwota - paczka.getPrice();
        }
        return kwota;
    }



    public boolean wyslij(List list) {
        boolean wyslany = false;
        for (int i = 0; i < listy.length; i++) {
            if (listy[i] == null) {
                listy[i] = list;
                list.setStatus(Status.NADANA);
                wyslany = true;
                break;
            }
        }
        return wyslany;
    }

    public void wyslijListonosza() {
        for (List list : listy) {
            if (list == null) {
                break;
            }
            list.setStatus(Status.WYSLANA);
        }
    }

    @Override
    public String toString() {
        return "Poczta{" +
                "utarg=" + utarg +
                ", listy=" + Arrays.toString(listy) +
                '}';
    }
}

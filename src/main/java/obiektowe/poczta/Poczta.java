package obiektowe.poczta;

public class Poczta {

    private double utarg = 0;
  /*  Do poczty dodaj metodę, która pozwoli nam nadawać paczki
    Metoda ma wymagać przekazania paczki oraz kwoty pieniędzy
    Metoda przyjmując paczkę powinna sprawdzić jej cenę, i jeśli zapłacono wystarczającą ilość pieniędzy ma zmienić jej status na “nadana” oraz zwrócić resztę.
    Jeśli przekazano zbyt małą kwotę ma zwrócić tę kwotę i nie modyfikować stanu paczki.
    Na koniec dodaj do poczty pole “utarg” i dodawaj do niego zarobione przez pocztę pieniądze.
*/
    double nadajPaczke(Paczka paczka, double kwota){
        if (kwota >= paczka.getPrice()) {
            paczka.setStatus("nadana");
            utarg += paczka.getPrice();
            return kwota - paczka.getPrice();
        }
        return kwota;
    }

    @Override
    public String toString() {
        return "Poczta{" +
                "utarg=" + utarg +
                '}';
    }
}

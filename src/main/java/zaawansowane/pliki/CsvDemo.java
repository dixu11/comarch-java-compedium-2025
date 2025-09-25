package zaawansowane.pliki;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class CsvDemo {
    public static void main(String[] args) {
        TextLoader textLoader = new TextLoader();
        List<String> lines = textLoader.loadCsvLines();
        System.out.println(lines);
        //wczytanie pliku tekstowego
        //wyciagniecie danych do zmiennych odpowiedniego typu
        //stworzenie obiektow
        //zwrocenie w formie listy

        try {
            getShop();
        }catch (DateException e){
            System.out.println("nie udało się odczytać daty, poszukamy gdzieś indziej...");
            System.out.println("Odpowiedzialny był: " + e.getNazwaSklepu());
        }
    }


    public static void getShop()throws DateException {
        System.out.println("Sklep");
        getProduct();
    }

    public static void getProduct() throws DateException {
        System.out.println("Produkt");
        getDate();
    }

    public static void getDate() throws DateException{
        System.out.println("Zwracam date");
        Random random = new Random();
        if (random.nextDouble() < 0.75) {
            throw new DateException("sklep1");
        } else {
            System.out.println("Data to "  + LocalDate.now());
        }
    }


}

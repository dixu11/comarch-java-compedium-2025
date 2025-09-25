package zaawansowane.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TextLoader {

    //FileNotFoundException wyjatek typu checked/compile time exception - wyłapywany na etapie kompilacji - wymusza obsługę wyjątku
    public List<String> loadCsvLines() {
        //InputMismatchException - nie wymaga obsługi, dziedziczy po RuntimeException - można uruchomić program bez try-catcha
        List<String> lines = new ArrayList<>();
        try { //w programie mavenowym trzeba dostawać się do ścieżki w resources w poniższy sposób:
            //Scanner scanner = new Scanner(new File (getClass().getClassLoader().getResource("planety.csv").getPath()));
            Scanner scanner2 = new Scanner(new File ("src/main/resources/planety.csv"));
            while (scanner2.hasNext()) {
                String line = scanner2.nextLine();
                lines.add(line);
            }
        }catch (FileNotFoundException | NullPointerException e){
            e.printStackTrace();
            System.out.println("Problem z załadowaniem pliku");
        }catch (InputMismatchException e) {
            System.out.println("problem z dopasowaniem");
        }catch (Exception e){
            System.out.println("neprzewidziane zamknięcie");
        }
        return lines;
    }
}

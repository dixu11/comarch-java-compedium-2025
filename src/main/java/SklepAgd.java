import java.util.Scanner;

public class SklepAgd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę towaru: ");
        double cena = scanner.nextDouble();
        if (cena > 10000 || cena < 100) {
            System.out.println("Cena wyższa od 10000zł lub niższa od 100zł");
            return;
        }
        System.out.println("Cena wynosi: " + cena + "zł");
        System.out.println("Podaj liczbę rat: ");
        int rata = scanner.nextInt();
        if (rata > 48 || rata < 6) {
            System.out.println("Ilość rat większa od 48 lub mniejsza od 6");
            return;
        }
        double kredyt = 0;
        System.out.println("ilość rat : " + rata);

        /*if (rata <= 12) {
            kredyt = 1.025 * cena;
        }
        if (rata >= 13 && rata <= 24) {
            kredyt = 1.05 * cena;
        }
        if (rata >= 25) {
            kredyt = 1.1 * cena;
        }*/

        //wersja skrócona
        if (rata <=12) {
            kredyt = 1.025 * cena;
        } else if (rata<=24){
            kredyt = 1.05 * cena;
        } else {
            kredyt = 1.1 * cena;
        }

        System.out.println("cena wynosi: " + kredyt + "zł.");
    }
}

import java.util.Scanner;

public class PetleWhile {
    //while
    //do-while
    //for
    //for-each

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int podana = scanner.nextInt();
        System.out.println("Podano " + podana);
        while (podana > 10) {
            System.out.println("Więcej niż 10");
            podana = podana -1;
            System.out.println(podana);
        }
    }
}

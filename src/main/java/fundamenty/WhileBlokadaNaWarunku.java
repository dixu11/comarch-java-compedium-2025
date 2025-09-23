package fundamenty;

import java.util.Scanner;

public class WhileBlokadaNaWarunku {
    public static void main(String[] args) {
        int password = 1234;
        Scanner scanner = new Scanner(System.in);
        int userTry = scanner.nextInt();
        while (password != userTry) {
            System.out.println("Spróbuj jeszcze raz");
             userTry = scanner.nextInt();
        }

        System.out.println("Secret");
    }
}

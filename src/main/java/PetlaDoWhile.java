import java.util.Scanner;

public class PetlaDoWhile {
    public static void main(String[] args) {
        int password = 1234;
        Scanner scanner = new Scanner(System.in);

        int userTry;
        do {
            System.out.println("Wprowadź hasło");
            userTry = scanner.nextInt();
        } while (password != userTry);

        System.out.println("Secret");
    }
}

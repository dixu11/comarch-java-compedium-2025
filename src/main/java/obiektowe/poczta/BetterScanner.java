package obiektowe.poczta;

import java.util.Scanner;

public class BetterScanner {
    private Scanner scanner = new Scanner(System.in);

    public String readText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int readNumber(String prompt) {
        System.out.print(prompt);
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}

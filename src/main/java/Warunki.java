import java.util.Scanner;

public class Warunki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka jest temperatura w celsjuszach?");
        int temperature = scanner.nextInt();
        if (temperature > 70) {
            System.out.println("Nie możliwe że tak dużo!");
            return; //wychodzi z metody
        }
        if (temperature < -70) {
            System.out.println("Nie możliwe że tak mało!");
            System.exit(1); //zamyka program
        }
        System.out.println("Podano: " + temperature + "C");

        if (temperature > 25) {
            System.out.println("Jest gorąco");
        }else{
            System.out.println("Jest zimno");
        }
    }
}

package fundamenty;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //tworzenie obiektu
        //Typ nazwa = new Typ();
        Scanner input = new Scanner(System.in);
        //next,nextLine,nextInt, nextDouble, nextBoolean
        System.out.println("Jak się nazywasz?");
        String name = input.nextLine();
        System.out.println("Jaka jest Twoja ulubiona liczba?");
        int number = input.nextInt();
        int multiplication = number*2;
        System.out.println("Cześć " + name + " Twoja liczba *2 to:"+
        multiplication);
    }
}

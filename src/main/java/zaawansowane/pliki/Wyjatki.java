package zaawansowane.pliki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) {
     /* stackDemo(0);

        int podana = podajLiczbe();
        System.out.println("Podana: " + podana);
        System.exit(1);*/


        //NullPointerException
        //ArrayIndexOutOfBoundException
        //ClassCastException
        //InputMismatchException

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        try{
            int liczba = scanner.nextInt();
            System.out.println("Podano " + liczba);
        }catch (InputMismatchException e){
            System.out.println("Wiadomosc wyjatku: " + e.getMessage());
            System.out.println("Podaj liczbe a nie text!");
        }



        String text = null;
        System.out.println(text.toUpperCase()); //Runtime Exception - wyjątki przerywające aplikacje
        System.out.println("hello");
    }

    public static int podajLiczbe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        try{
            int liczba = scanner.nextInt();
           // System.out.println("Podano " + liczba);
            return liczba;
        }catch (InputMismatchException e){
            System.out.println("Wiadomosc wyjatku: " + e.getMessage());
            System.out.println("Podaj liczbe a nie text!");
           return podajLiczbe();
        }
    }

    public static void stackDemo(int counter) {
        System.out.println(counter);
        counter++;
        stackDemo(counter);
    }
}

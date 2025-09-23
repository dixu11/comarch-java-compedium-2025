package proceduralne;

import java.util.Arrays;

public class BibliotekiStatyczne {
    public static void main(String[] args) {
        //Arrays, Collections, LocalDate, Math, Character, System, Thread

        System.out.println(Math.PI);
        System.out.println(Math.floor(Math.PI));
        System.out.println(Math.pow(6,2));
        int[] numbers = new int[10];
        Arrays.fill(numbers, 7);
        System.out.println(Arrays.toString(numbers));
        int[] numbersShort = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(numbersShort));

        //pod spodem ascii / unicode
        char letter = '3';
        letter++;
        System.out.println(letter);
        if (Character.isDigit(letter)) {
            System.out.println("Cyfra");
        } else {
            System.out.println("Nie cyfra");
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }


        String text = "70";

    }
}

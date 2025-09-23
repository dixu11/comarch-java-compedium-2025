package fundamenty;

import java.util.Random;

public class ForEach3 {
    public static void main(String[] args) {
        //zmieniłem na for each wszystkie pętle które się dało z klasy fundamenty.ForEach

        Random random = new Random();
        double[] numbers = new double[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble(); //0-1 0.3443246547456743523421
        }

        double[] smallNumbers = new double[100];
        int counter = 0;
        for(double number:numbers){
            if (number <= 0.25) {
                smallNumbers[counter] = number;
                counter++;
            }
        }

        System.out.println("Znaleziono " + counter + " liczb poniżej 25%");
        for(double number: smallNumbers){
            System.out.println(number);
        }
        double[] smallNumbersCorrected = new double[counter];
        for (int i = 0; i < counter; i++) {
            smallNumbersCorrected[i] = smallNumbers[i];
        }
        smallNumbers = smallNumbersCorrected;
        //w tablicy już nie ma zer
        System.out.println("Pętla for each - iteruje po elementach zbioru");
        System.out.println("zawsze działa na zbiorze");
        System.out.println("odczytuje wartości (nie możemy przestawiać)");
        for (double smallNumber : smallNumbers) {
            System.out.println(smallNumber);
        }
    }
}

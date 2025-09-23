package proceduralne;

import java.util.Random;

public class StringDemo {
    public static void main(String[] args) {
        String[] napisy = {"hello", "witam", "dzień dobry"};
        Random random = new Random();
        System.out.println(napisy[random.nextInt(napisy.length)]); //0-3

        String longText = "";

        for (int i = 0; i < 200_000; i++) {
            System.out.println("Test test");
        }


        //string przechowuje tablice charow
        //string niemodyfikowalny, buduje go zawsze od nowa przy doklejaniu (konkatenacja)

        char[] text = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < 200_000; i++) {
           // longText += "hello";
        }
        System.out.println(longText);

        StringBuilder text2 = new StringBuilder();
        for (int i = 0; i < 200_000; i++) {
            text2.append("HELLO");
        }
        System.out.println(text2);
        //odzyskanie String
        String textFromSb = text2.toString();




    }
}

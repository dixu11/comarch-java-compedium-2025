package zaawansowane;

public class Rzutowanie {

    public static void main(String[] args) {
        double kwota = 9.99;
        int liczba = (int) kwota;
        System.out.println(liczba);
        //int liczba2 = (int)"1";
        String cyfra = "1";
        liczba = Integer.parseInt(cyfra);

        char letter = 'a';
        System.out.println((int) letter);
        int liczbaAsci = letter;
        char letter2 = (char) liczba;
        System.out.println(letter2);

        byte myByte = (byte) 129;
        System.out.println(myByte);
        //int myInt = 3_000_000_000;
        long myInt = 3_000_000_000_000_000_000L;

        System.out.println(Long.MAX_VALUE);

        System.out.println((int) myInt);
        float dziesietna = 10.2f;

    }
}

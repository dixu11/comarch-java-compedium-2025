public class Tablice {
    public static void main(String[] args) {
        int number =  10;
        int[] numbers = new int[5];
       // int[] numbers2 = new int[5];

        numbers[0] = 3;
        numbers[1] = 7;
        numbers[2] = 9;
        numbers[3] = 1;
        System.out.println(number);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //kod wyraza zasadę: drukuję pierwsze 3 liczby a nie wszystkie liczby
        System.out.println("Liczby podane to: "
                + numbers[0] + " "+ numbers[1] + " " + numbers[2]);

        //piszemy kod który drukuje WSZYSTKIE liczby z tablicy
        int counter = 0;
        while(counter < numbers.length){
            System.out.println(numbers[counter]);
            counter++;
        }
    }
}

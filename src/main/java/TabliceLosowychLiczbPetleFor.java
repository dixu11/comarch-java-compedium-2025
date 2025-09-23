import java.util.Random;

public class TabliceLosowychLiczbPetleFor {
    public static void main(String[] args) {
       /* int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 1;

        int counter = 0;
        while (counter < numbers.length) {
            System.out.println(numbers[counter]);
            counter++;
        }
         System.out.println("print jeszcze raz");
        counter = 0;
        while (counter < numbers.length) {
            System.out.println(numbers[counter]);
            counter++;
        }

        */

        //wstawianie bezpośrednio wartości
//        int[] numbers = new int[]{3,4,1};
  //      int[] numbers = {3, 4, 1};


        //losowanie wartości
        Random random = new Random();
        int[]numbers = new int[300];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1,11);
        }


        //standardowo
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //od końca
        System.out.println("Od końca:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            //System.out.println(numbers[i]);
        }

       /* for(inicjacja licznika; warunek; zmiana licznika){

        }*/
        /* nieskończone pętle
        while(true){

        }
        for(;;){

        }
        */


        //Random[] random = {new Random(), new Random()};

    }
}

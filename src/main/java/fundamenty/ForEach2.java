package fundamenty;

public class ForEach2 {
    public static void main(String[] args) {
        int[] numbers = {34, 456, 567, 345};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for(int number:numbers){
            System.out.println(number);
        }



    }
}

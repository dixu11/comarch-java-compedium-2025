import java.util.Random;

public class PetlaWhileLosowa {
    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(11); // do 10
        System.out.println("Count wylosowąło:" + count);
        int counter = 0;
        while(counter<count){
            System.out.println("Hello " + counter);
           // counter += 1;
            counter++;
        }
    }
}

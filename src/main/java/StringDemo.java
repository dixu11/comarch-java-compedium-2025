import java.util.Random;

public class StringDemo {
    public static void main(String[] args) {
        String[] napisy = {"hello", "witam", "dzień dobry"};
        Random random = new Random();
        System.out.println(napisy[random.nextInt(napisy.length)]); //0-3
    }
}

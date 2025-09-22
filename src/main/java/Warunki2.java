import java.util.Random;
import java.util.Scanner;

public class Warunki2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Jaka jest temperatura w celsjuszach?");
//        int temperature = random.nextInt(10);// 0-9
        int temperature = random.nextInt(-40,41);// -40 - 40
        System.out.println("Podano: " + temperature + "C");
        if (temperature > 70 || temperature < -70) {
            System.out.println("Absurdalna temperatura");
            return; //wychodzi z metody
        }

        if (temperature > 25) {
            System.out.println("Jest gorąco");
        } else if(temperature >15){
            System.out.println("jest normalnie");
        } else  {
            System.out.println("Jest zimno");
        }


        if(temperature>15){
            System.out.println("Ubierz się normalnie");
        }else if(temperature> 10){
            System.out.println("Ubierz bluzę");
        } else if (temperature > 0) {
            System.out.println("ubierz kurtkę");
        }else if (temperature> -10){
            System.out.println("Ubierz szalik");
        }else{
            System.out.println("Ubierz się na cebulkę");
        }


    }
}

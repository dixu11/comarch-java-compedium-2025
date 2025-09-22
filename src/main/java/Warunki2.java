import java.util.Scanner;

public class Warunki2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka jest temperatura w celsjuszach?");
        int temperature = scanner.nextInt();
        if (temperature > 70 || temperature < -70) {
            System.out.println("Absurdalna temperatura");
            return; //wychodzi z metody
        }
        System.out.println("Podano: " + temperature + "C");

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

package zaawansowane;

import obiektowe.Planeta;

public class SwitchStatemant {
    public static void main(String[] args) {
        int trafienia = 1;
        switch (trafienia) {
            case 0:
            case 1:
            case 2:
                System.out.println("Wygrałeś 0 zł");
                break;
            case 3:
                System.out.println("Wygrałeś 16 zł");
                break;
            case 4:
                System.out.println("Wygrałeś 200 zł");
                break;
            case 5:
                System.out.println("Wygrałeś 4000 zł");
                break;
            case 6:
                System.out.println("Wygrałeś 20000 zł");
                break;
            default:
                System.out.println("Niepoprawna wartość");
        }

        int nagroda = switch (trafienia) {
            case 0, 1, 2 -> 0;
            case 3 -> 16;
            case 4 -> 200;
            case 5 -> 2000;
            case 6 -> 2000000;
            default -> -1;
        };

        System.out.println("Nagroda " + nagroda);

        //switch działa też z enumami
        Planeta planeta = Planeta.JOWISZ;
        switch (planeta){
            case MERKURY -> {
                System.out.println("test");
            }
            case JOWISZ -> {
                System.out.println("test2");
            }

        }

    }
}

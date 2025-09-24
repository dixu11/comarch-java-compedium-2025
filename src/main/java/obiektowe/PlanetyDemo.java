package obiektowe;

public class PlanetyDemo {
    public static void main(String[] args) {
        Planeta planeta1 = Planeta.MARS;
        Planeta planeta2 = Planeta.ZIEMIA;

        planeta1.porownajTemperatury(planeta2);

        ;
        Planeta poprzednia = null;
        for (Planeta planeta : Planeta.values()) {
            if (poprzednia != null) {
                poprzednia.porownajTemperatury(planeta);
            }
//            System.out.println(planeta);
//            System.out.println(planeta.ordinal());
            poprzednia = planeta;
        }
    }
}

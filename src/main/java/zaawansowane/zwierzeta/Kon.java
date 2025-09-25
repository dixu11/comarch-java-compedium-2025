package zaawansowane.zwierzeta;

public class Kon extends Zwierze implements Roslinozerca{
    public Kon(String imie) {
        super(imie);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Ihahaha");
    }

    @Override
    public void jedzLiscie() {

    }

    @Override
    public void biegaj() {

    }
}

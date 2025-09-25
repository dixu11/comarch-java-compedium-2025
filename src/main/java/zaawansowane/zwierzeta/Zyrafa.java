package zaawansowane.zwierzeta;

public class Zyrafa extends Zwierze{

    private int dlugoscSzyi;

    public Zyrafa(String imie, int dlugoscSzyi) {
        super(imie);
        this.dlugoscSzyi = dlugoscSzyi;
    }

    public Zyrafa() {
        super("Frania");
        dlugoscSzyi = 200;
    }

    public void wydajDzwiek() {
        mlaska();
    }

    public void mlaska() {
        System.out.println("*plask plask mlask*");
    }

    public void wypatrujLiscie() {
        System.out.println("(zyrafa biegnie do drzewa po najwyższe liście)");
    }

    public void jedz(){
        System.out.println("Żyrafa je najwyższe liście");
    }
}

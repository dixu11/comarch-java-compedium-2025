package zaawansowane.zwierzeta;

public class Zyrafa extends Zwierze{

    private String imie;
    private int dlugoscSzyi;

    public Zyrafa(String imie, int dlugoscSzyi) {
        this.imie = imie;
        this.dlugoscSzyi = dlugoscSzyi;
    }

    public Zyrafa() {
        imie = "Frania";
        dlugoscSzyi = 200;
    }

    public void jedz() {
        System.out.println(imie  + " je");
    }

    public void mlaska() {
        System.out.println("*plask plask mlask*");
    }

    public void wypatrujLiscie() {
        System.out.println("(zyrafa biegnie do drzewa po najwyższe liście)");
    }
}

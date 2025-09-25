package zaawansowane.zwierzeta;

public class Slon extends Zwierze {

    private String imie;
    private int dlugoscTromby;

    public Slon(String imie, int dlugoscTromby) {
        this.imie = imie;
        this.dlugoscTromby = dlugoscTromby;
    }

    public Slon() {
        imie = "Bambi";
        dlugoscTromby = 100;
    }

    public void jedz() {
        System.out.println(imie  + " je");
    }

    public void zatrab(){
        System.out.println("Trutututuuu");
    }

    public void zatupcz() {
        System.out.println("tuptuptu");
    }
}

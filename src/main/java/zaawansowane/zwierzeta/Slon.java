package zaawansowane.zwierzeta;

public class Slon extends Zwierze implements Roslinozerca,Dzikie {

    private int dlugoscTromby;

    public Slon(String imie, int dlugoscTromby) {
        super(imie);
        this.dlugoscTromby = dlugoscTromby;
    }

    public Slon() {
       super("Bambi"); //Jeśli nie ma bezparametrowego konst. w Zwierze muszę wywołać super jawnie i przekazać wymagane parametry
        dlugoscTromby = 100;
    }


    public void zatrab(){
        System.out.println("Trutututuuu");
    }

    public void wydajDzwiek() {
        zatrab();
    }

    public void zatupcz() {
        System.out.println("tuptuptu");
    }

    public void jedz() {
        super.jedz(); // mogę wywołac wersję ze Zwierze
        System.out.println("Słoń je nisko wiszące liście");
    }

    @Override
    public void wypuscNaSafari() {

    }

    @Override
    public void jedzLiscie() {

    }

    @Override
    public void biegaj() {

    }
}

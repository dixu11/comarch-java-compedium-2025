package zaawansowane.zwierzeta;

public class Main {
    public static void main(String[] args) {
        Slon zwierze = new Slon();
        Zwierze zyrafa = new Zyrafa();
       // zwierze = new Zwierze();

        //zwierze = new Kon();
        zwierze.zatrab();
        zwierze.zatupcz();
        zwierze.jedz();

        zyrafa.mlaska();
        zyrafa.wypatrujLiscie();
        zyrafa.jedz();
    }
}

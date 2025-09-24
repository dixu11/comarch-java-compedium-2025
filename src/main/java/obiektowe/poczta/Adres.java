package obiektowe.poczta;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
    }


    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numerDomu='" + numerDomu + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}

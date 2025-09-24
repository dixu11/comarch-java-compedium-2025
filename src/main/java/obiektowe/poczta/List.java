package obiektowe.poczta;

public class List {
    private Adres nadawca;
    private Adres odbiorca;
    private String status = "utworzony";

    public List(Adres nadawca, Adres odbiorca) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "List{" +
                "nadawca=" + nadawca +
                ", odbiorca=" + odbiorca +
                ", status='" + status + '\'' +
                '}';
    }
}

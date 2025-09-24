package obiektowe.poczta;

import obiektowe.Status;

public class List {
    private Adres nadawca;
    private Adres odbiorca;
    private Status status = Status.NADANA;

    public List(Adres nadawca, Adres odbiorca) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
    }

    public void setStatus(Status status) {
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

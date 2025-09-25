package zaawansowane.pliki;

public class DateException extends Exception { // moj wyjate

    private String nazwaSklepu;

    public DateException(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }
}

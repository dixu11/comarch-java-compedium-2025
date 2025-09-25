package zaawansowane.zwierzeta;

public interface Dzikie {
    //interfejsy nie mają stanu / cech /pól
    //private int liczba = 10;
    public static final int LICZBA = 10;
    //kazda zmienna w interfejsie jest domyslnie stala statyczna

    //nie ma konstruktorów
 /*   public Dzikie(){

    }*/


    //w interfejsie mamy wszystkie metody domyslnie abstrakcyje i publiczne
    void wypuscNaSafari();
    void biegaj();
}

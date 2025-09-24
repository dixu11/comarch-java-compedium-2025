package obiektowe;

public class Drzewo {
    public String nazwa;
    public boolean iglaste;
    public double wysokoscMetry;

    public Drzewo(String nazwaDrzewa, boolean iglaste, double wysokoscMetry) {
        nazwa = nazwaDrzewa;
        this.iglaste = iglaste;
        this.wysokoscMetry = wysokoscMetry; //ta sama nazwa ale this. dla rozróżnienia co jest na obiekcie


    }

    public void wyswietl() {
        System.out.printf("Drzwo %s typu: %s wysokość: %8.2fm\n",
                nazwa, typ(), wysokoscMetry);
    }
    //formatowany print. Podstawiamy pod szablon:
    //%s - string
    //%d - liczba całkowita
    //%f - podstawia dziesiętną
    //%8.2f - 8 znaków zajmie liczba (doda spacje w puste) + 2 po przecinku
    // (- od drugiej strony zacznie)

    public String dajTekstowaReprezentacje() {
        return String.format("Drzwo %s typu: %s wysokość: %8.2fm\n",
                nazwa, typ(), wysokoscMetry);
    }

    private String typ() {
        if (iglaste) {
            return "iglaste";
        } else {
            return "liściaste";
        }
    }

    String dajNazwe() {
        return nazwa;
    }

    protected String dajTyp() {
        return typ();
    }


    //private - dostęp tylko w klasie
    //(default/package-private) - tylko dla pakietu
    //protected - tylko dla pakietu i klas dziedziczących z innych pakietów
    //public - we wszystkich pakietach

}

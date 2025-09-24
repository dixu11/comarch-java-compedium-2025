package obiektowe;

public enum Planeta {
    MERKURY(167, 0, 57910000L),
    WENUS(464, 0, 108200000L),
    ZIEMIA(15, 1, 149600000L),
    MARS(-65, 2, 227900000L),
    JOWISZ(-110, 95, 778500000L),
    SATURN(-140, 146, 1434000000L),
    URAN(-195, 28, 2871000000L),
    NEPTUN(-200, 16, 4495000000L);

    //pola
    private int temperatura;
    private int ksiezyce;
    private long odlegloscOdSlonca;

    //konstruktory

   Planeta(int temperatura, int ksiezyce, long odlegloscOdSlonca) {
        this.temperatura = temperatura;
        this.ksiezyce = ksiezyce;
        this.odlegloscOdSlonca = odlegloscOdSlonca;
    }


    //metody
    public void porownajTemperatury(Planeta planeta) {
        int roznica = temperatura - planeta.temperatura;
        String cieplejsza = name();
        String zimniejsza = planeta.name();

        if (roznica < 0) {
            roznica = Math.abs(roznica);
            cieplejsza = planeta.name();
            zimniejsza = name();
        }
        System.out.printf("%s jest cieplejsze o %dC od %s\n", cieplejsza, roznica, zimniejsza);    }


    @Override
    public String toString() {
        return "Planeta{" +
                "temperatura=" + temperatura +
                ", ksiezyce=" + ksiezyce +
                ", odlegloscOdSlonca=" + odlegloscOdSlonca +
                '}';
    }
}

//public static final

package proceduralne;

public class OpcjonalnyParametr {
    public static void main(String[] args) {
        przywitaj("Jan", "Nowak");
        przywitaj("Jan");
    }

    public static void przywitaj(String imie, String nazwisko){
        System.out.println("Witaj " + imie + " " + nazwisko);
    }

    public static void przywitaj(String imie){
        przywitaj(imie, "Kowalski");
    }
}

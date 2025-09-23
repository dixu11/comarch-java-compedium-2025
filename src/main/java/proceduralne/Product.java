package proceduralne;

public class Product {
    //cechy/zmienne/pola(zmienne w obiekcie)
    double cena;
    String nazwa;

    //zachowania/metody
    public void wyswietlOpis(){
        System.out.println("Produkt o nazwie : " +nazwa);
        System.out.println("Ma cenę : " + cena);
    }

}

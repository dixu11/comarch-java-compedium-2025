package obiektowe;

public class Product {
    //cechy/zmienne/pola(zmienne w obiekcie)
   private double cena;
   private String nazwa;

    public Product(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    //zachowania/metody
    public void wyswietlOpis(){
        System.out.println("Produkt o nazwie : " +nazwa);
        System.out.println("Ma cenę : " + cena);
    }

    public double getPrice(){
        return cena;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cena=" + cena +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}

package obiektowe;

import java.util.Objects;
import java.util.Random;

public class Product {
    //cechy/zmienne/pola(zmienne w obiekcie)
    private double cena;
    private String nazwa;

    public Product(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    //zachowania/metody
    public void wyswietlOpis() {
        System.out.println("Produkt o nazwie : " + nazwa);
        System.out.println("Ma cenę : " + cena);
    }

   /* public boolean equals(Object other) {
        if (other == null || !other.getClass().equals(getClass())) {
            return false;
        }
        Product otherProduct = (Product) other;
        return cena == otherProduct.cena && nazwa.equals(otherProduct.nazwa);
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return Double.compare(cena, product.cena) == 0 && Objects.equals(nazwa, product.nazwa);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(cena);
        result = 31 * result + Objects.hashCode(nazwa);
        return result;
    }

    public double getPrice() {
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

package obiektowe;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PorownywanieObiektow {
    public static void main(String[] args) {
        int liczba = 10;
        int liczba2 = 10;

        Product product = new Product(20, "magazyn");
        Product product2 = new Product(20, "magazyn");

        System.out.println(liczba == liczba2);
        //== w kontekście obiektów porównuje referencje/adresy w pamięci/wskaźniki
        System.out.println(product == product2);
        //equals domyślnie również porównuje adreasy
        System.out.println(product.equals(product2));
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.remove(new Product(20, "magazyn"));
        System.out.println(products);

        //enumy i typy prymitywne można prównywać przez ==

        String text = "abc";
        System.out.println(text == "abc");
        System.out.println(text == new String("abc"));
        Scanner scanner = new Scanner(System.in);
        System.out.println(text == scanner.nextLine());

        //przy stringach zawsze koniecznie equals

    }
}

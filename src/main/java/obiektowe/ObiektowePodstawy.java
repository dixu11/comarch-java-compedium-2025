package obiektowe;

import java.util.Random;

public class ObiektowePodstawy {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 10);
        System.out.println(number);

        Product product1 = new Product( 1200,"nowy rower");
//        product1.nazwa = "nowy rower";
//        product1.cena = 1200;
        Product product2 = new Product(400, "stary rower");
//        product2.nazwa = "stary rower";
//        product2.cena = 400;
       // product2.cena = 500;

        /*System.out.println("Produkt o nazwie : " + product.nazwa);
        System.out.println("Ma cenę : " + product.cena);

        System.out.println("Produkt o nazwie : " + product2.nazwa);
        System.out.println("Ma cenę : " + product2.cena);*/

        product1.wyswietlOpis();
        product2.wyswietlOpis();

     /*   Product[] products = new Product[2];
        products[0] = product1;
        products[1] = product2;*/

        Product[] products = {product1,product2};

        double sumaCeny = 0;
        for(Product product: products){
           // sumaCeny += product.cena;
            sumaCeny += product.getPrice();
        }

        System.out.println("Łączna cena wynosi: " + sumaCeny);
    }
}

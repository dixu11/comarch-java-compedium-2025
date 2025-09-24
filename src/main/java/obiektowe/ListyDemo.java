package obiektowe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyDemo {
    public static void main(String[] args) {
        //tablice (array) to nie kolekcje ale również struktury danych
        int number = 10;
        Integer number2 = 12;


        //Collections
        //List, Set, Queue, Map

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        numbers.add(10);
        numbers.add(20);
        //numbers.add("abc");

        System.out.println(numbers);
        System.out.println(numbers.size());
        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "gazeta"));
        products.add(new Product(10, "magazyn"));
        System.out.println(products);

        numbers.remove(0);
        System.out.println(numbers);

        List<String> names = new ArrayList<>();
        names.add("Marcin");
        names.add("Damian");
        names.add("Asia");
        names.add("Damian");
        names.add("Damian");
        names.add("Damian");
        names.add("Damian");
        names.add("Damian");
        names.add("Damian");

        while (true) {
            boolean removed = names.remove("Damian");
            if (!removed) break;
        }

        System.out.println(names);

        names.add(1,"Zofia");
        System.out.println(names);

        //names.removeAll();

        List<String> names2 = new LinkedList<>();
        names2.add("Zofia");
        names2.add("Damian");
        names2.add("Marta");

        //List.of tworzy niemodyfikowalną Listę ale możemy ją dać ArrayLiście do konstruktora
        List<String> names3 = new ArrayList<>(List.of("Zofia", "Damian", "Marcin"));
        System.out.println(names3);

        names2.removeAll(names3);
        System.out.println(names2);



        names3.removeAll(names2);
        System.out.println(names3);
    }
}

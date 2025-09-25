package zaawansowane.collections;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class KolekcjeDemo {
    public static void main(String[] args) {
        //listy(List) - dostęp po indeksie umożliwiają powtórki
        //zbiory(Set) - przechowują unikatowe wartości bez dostępu po indeksie - najwyjniejsza kolekcja
        //mapy(Map) - zbiory klucz wartość, gdzie klucz jest unikatowy
        //kolejki(Queue) - kolejki - FIFO
                //Dequeue - kolejki z możliwością dostępu z obu stron można zrealizwać: FILO

        Set<Person> names = new HashSet<>();
        names.add(new Person("Marcin"));
        names.add(new Person("Marta"));
        names.add(new Person("Damian"));
        names.add(new Person("Dawid"));
        names.add(new Person("Dosia"));
        names.add(new Person("Dosia"));
        System.out.println(names);

        for (Person name : names) {
            System.out.println(name);
        }

        System.out.println(names.contains(new Person("Marcin")));

        //TreeSet - trzyma elementy stale w formie posortowanej


        Map<String, Person> osoby = new HashMap<>();
        osoby.put("jan.kowalski@gmail.com", new Person("Jan Kowalski"));


        System.out.println(osoby.get("jan.kowalski@gmail.com"));
        System.out.println(osoby.get("anna.kowalski@gmail.com"));

        Map<Panstwo, String> stolice = new HashMap<>();
        stolice.put(Panstwo.POLSKA, "Warszawa");
        stolice.put(Panstwo.USA, "Waszyngton");
        stolice.put(Panstwo.FRANCJA, "Paryz");

        System.out.println(stolice);

       for(Panstwo panstwo: stolice.keySet()){
           System.out.println(stolice.get(panstwo));
       }

       for(String stolica: stolice.values()){
           System.out.println(stolica);
       }

        for (Map.Entry<Panstwo, String> para : stolice.entrySet()) {
            para.setValue(para.getValue() + ".");
            System.out.println(para.getKey());
            System.out.println(para.getValue());
        }
        System.out.println(stolice);

        Queue<Person> people = new LinkedList<>();

        people.add(new Person("Marcin"));
        people.add(new Person("Marta"));
        people.add(new Person("Damian"));
        people.add(new Person("Dawid"));
        people.add(new Person("Dosia"));
        people.add(new Person("Dosia"));

        System.out.println(people.poll()); //wyciąga u usuwa z kolejki
        System.out.println(people);
        System.out.println(people.poll());
        System.out.println(people);
        System.out.println(people.poll());
        System.out.println(people);


        Deque<Person> people2 = new LinkedList<>();
        Deque<Person> people3 = new LinkedBlockingDeque<>(1);
        people2.add(new Person("Marcin"));
        people2.add(new Person("Marta"));
        people2.add(new Person("Damian"));
        people2.addFirst(new Person("Dawid"));
        people2.add(new Person("Dosia"));
        people2.add(new Person("Dosia"));
        System.out.println(people2);


        people3.add(new Person("Zofia"));
        people3.offer(new Person("Zofia"));
       // people3.add(new Person("Zofia"));
    }
}

enum Panstwo {
    POLSKA, USA, FRANCJA
}

class Klasa2 {

}

package zaawansowane.funkcyjne;

import zaawansowane.collections.Person;

import java.math.BigInteger;
import java.util.*;

class Order{
    private  String clientName;
    private int count = 1;

    public Order(String clientName) {
        this.clientName = clientName;

    }

    @Override
    public String toString() {
        return "Order{" +
                "clientName='" + clientName + '\'' +
                ", count=" + count +
                '}';
    }
}

public class Streamy {
    public static void main(String[] args) {
        //Interfejsy funkcyjne w javie:
        //Runnable - () -> void
        //Consumer - (X) -> void
        //Supplier - () -> X
        //Function - (X) -> Y
        //Operator - (X) -> X
        //Predicate - (X) -> boolean
        //Comparator - (X,X) -> int  //mówi jak sortować elementy, minusowo mniejszy, równy, dodatni większy


        Set<Person> people = new HashSet<>();
        people.add(new Person("Marcin"));
        people.add(new Person("Marta"));
        people.add(new Person("Damian"));
        people.add(new Person("Dawid"));
        people.add(new Person("Dosia"));


        for (Person person : people) {
            System.out.println(person.getName());
        }

        class IntegerWrapper{
            int counter = 0;
        }
        System.out.println("---");
       final int counter = 0;

      final   IntegerWrapper wrapper = new IntegerWrapper();

        people.forEach( (Person person) -> System.out.println(person.getName()));
       //wyrażenie lambda nie może modifikowac zmiennych poza wyrażeniem bo będzie potencjalnie
        // istnieć jeszcze po skończeniu tej metody (wtedy tych zmiennych lokalnych już nie będzie)
        //można to obejść przez zmienne w obiektach
        people.forEach(  person ->{
            System.out.println(person.getName());
            if (person.getName().endsWith("a")) {
                System.out.println(counter);
                wrapper.counter++;
            }
        });
        System.out.println(wrapper.counter);

        List<Person> peopleList = new ArrayList<>(people);
        peopleList.sort((person1, person2) -> -person1.getName().compareTo(person2.getName()));
        System.out.println(peopleList);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.sort((number1, number2) -> number2-number1);
        System.out.println(numbers);

        long count = peopleList.stream()
                .filter(person -> !person.getName().endsWith("a"))
                .count();
        System.out.println(count);

        //zbieram do listy imion
      List<String> names =   peopleList.stream()
                .map(person -> person.getName() )
                .toList();

        //names.add("Dawid"); // uwaga na niemodyfkowalne listy
        System.out.println(names);
       List<Order> orders = peopleList.stream()
                .distinct() //usuwa powtórki
                .map(person -> new Order(person.getName()))
                .toList();
        System.out.println(orders);


       // names = new ArrayList<>(); // test jak się zachowa z pustym zbiorem
        OptionalDouble optional = names.stream() // optional występuje gdy jest ryzyko otrzymania null
                .mapToInt(name -> name.length()) // mapowanie na wyspecjalizowany stream obiektów
                .average();
        System.out.println(optional.isPresent());
        System.out.println(optional.getAsDouble());

        //optional od razu obsłuzony:
       double wynik =   names.stream() // optional występuje gdy jest ryzyko otrzymania null
                .mapToInt(name -> name.length()) // mapowanie na wyspecjalizowany stream obiektów
                .average()
                 .orElse(0);
        System.out.println(wynik);
    }
}

package obiektowe.citizen;

/*
* Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
Peasant(Chłop),
Townsman(Mieszczanin),
King(Król),
Soldier(Żołnierz)
Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować
* to pole). Citizen powinien być klasą abstrakcyjną która
* posiada metodę abstrakcyjną 'canVote' która zwraca true
* dla townsman'a i soldier'a, ale false dla chłopa i króla.

Stwórz klasę Town która posiada zbiór obiektów typu Citizen. Dodaj do niej kilku citizenów (tworząc ich w main). Obiekt klasy Town ma mieć metody:
howManyCanVote -  które zwracają ilość osób które mogą głosować
whoCanVote -  która wypisuje imiona osób które mogą głosować
*
* */

public class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Mieszko");
        Peasant peasant = new Peasant("Janusz");
        Soldier soldier = new Soldier("Bruno");
        Townsman townsman = new Townsman("Mariusz");
       // Citizen citizen = new Citizen();

        Town town = new Town();
        town.addCitizen(king);
        town.addCitizen(peasant);
        town.addCitizen(soldier);
        town.addCitizen(townsman);

        System.out.println(town.howManyCanVote());
        town.whoCanVote();
    }
}

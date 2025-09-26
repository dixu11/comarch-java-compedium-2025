package zaawansowane;


import zaawansowane.zwierzeta.Zwierze;

class Employee{
    private String job;
     double salary;

    public Employee(String job, double salary) {
        this.job = job;
        this.salary = salary;
    }

    public double calculateYearlySalary(){
        return salary * 12;
    };
}

//w pliku javowym jest tylko jedna klasa publiczna - zgodna z nazwą pliku
public class KlasyDemo {
   static int liczba = 20;

    public static void main(String[] args) {

        int liczba = 10;

        System.out.println(liczba);
        System.out.println(KlasyDemo.liczba);

        class Lokalna{

        }

        KlasaPakietowa pakietowa = new KlasaPakietowa();
        Lokalna lokalna = new Lokalna();

        Employee juniorProgrammer = new Employee("programista junior", 5000);


        //klasa anonimowa - w locie dziedziczy po innej klasie, do jednorazowego zmienionego obiektu
        Employee senior = new Employee("programista junior", 5000){

            public double calculateYearlySalary() {
                return salary * 13;
            }

        };


        System.out.println(juniorProgrammer.calculateYearlySalary());
        System.out.println(senior.calculateYearlySalary());
    }

    //może być statyczna i niestatyczna.
    // Statyczna może działać w oderwaniu od obiektu klasy zewnetrznej.
    // Niestatyczna będzie zawsze związana z obiektem klasy zewnętrznej.
    //może być prywatna i może mieć dostęp do prywatnych cech klasy zewnętrznej
  static class Wewnetrzna{

    }
}

//klasa pakietowa
class KlasaPakietowa{

}


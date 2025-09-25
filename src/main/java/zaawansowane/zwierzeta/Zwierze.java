package zaawansowane.zwierzeta;
//klasa abstrakcyjna pozwala na tworzenie abstrakcyjnych metod i uniemożliwika stworzenie instacji obiektu Zwierze
public abstract class Zwierze {

     private String imie;

    public Zwierze(String imie) {
        this.imie = imie;
    }

    public void jedz() {
        System.out.println("zwierze je");
    }

    //metoda abstrakcyjna musi zostać zaimplementowana
    public abstract void wydajDzwiek();


}

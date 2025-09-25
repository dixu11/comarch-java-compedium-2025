public class KlasaWRoot {

    public static void main(String[] args) {
        KlasaWRoot.publicMethod();

        KlasaWRoot klasaWRoot = new KlasaWRoot();
        klasaWRoot.hello();
    }

    //mimo że metoda publiczna nie wywołam jej z innego pakietu
    //bo ta klasa nie jest w żadnym pakiecie i nie da się jej zaimportować
    public static void publicMethod() {
        System.out.println("hello");
    }

    public void hello() {
        System.out.println("Hello2");
    }
}

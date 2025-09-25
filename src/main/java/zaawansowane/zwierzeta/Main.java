package zaawansowane.zwierzeta;

public class Main {
    public static void main(String[] args) {
        Slon slon = new Slon("Roman",100);
        Zyrafa zyrafa = new Zyrafa("Edek",150);
      // Zwierze zwierze = new Zwierze();

        //zwierze = new Kon();
        slon.zatrab();
        slon.zatupcz();
        slon.jedz();

        zyrafa.mlaska();
        zyrafa.wypatrujLiscie();
        zyrafa.jedz();
        System.out.println("------");
        OpiekunZoo franek = new OpiekunZoo();
        franek.nakarmSlonia(slon);
        franek.nakarmZyrafe(zyrafa);
        System.out.println("-----");
        franek.nakarmZwierzeV2(slon);
        franek.nakarmZwierzeV2(zyrafa);
        franek.nakarmZwierzeV2(new Kon("Zbychu"));
        System.out.println("------");

        //polimorfizm przeniesienie implementacji na typ.
        // ta sama zmienna z ta sama metoda zachowuje sie różnie zależnie od typu
        Zwierze zwierze = new Kon("Milka");
        zwierze.wydajDzwiek();
        zwierze = new Zyrafa();
        zwierze.wydajDzwiek();

    }
}

package zaawansowane.zwierzeta;

public class OpiekunZoo {

    public void nakarmSlonia(Slon slon) {
        System.out.println("Karmię słonia");
        slon.jedz();
        slon.zatrab();
    }

    public void nakarmZyrafe(Zyrafa zyrafa) {
        System.out.println("Karmię żyrafę");
        zyrafa.wypatrujLiscie();
        zyrafa.jedz();
        zyrafa.mlaska();
    }
    //kod bez polimorfizmu - wymaga modyfikacji przy każdym nowym typie
    public void nakarmZwierzeV1(Zwierze zwierze){
        System.out.println("Karmię zwierze");
        zwierze.jedz();
        if (zwierze instanceof Slon) {
            Slon slon = (Slon)zwierze;
            slon.zatrab();
        }else if(zwierze instanceof Zyrafa){
            Zyrafa zyrafa = (Zyrafa) zwierze;
            zyrafa.mlaska();
        }
    }

    //kod czystszy, wykorzystuje polimorfizm i będzie kompatybilny z kolejnymi zwierzętami
    public void nakarmZwierzeV2(Zwierze zwierze){
        System.out.println("Karmię zwierze");
        zwierze.jedz();
        zwierze.wydajDzwiek();
    }
}

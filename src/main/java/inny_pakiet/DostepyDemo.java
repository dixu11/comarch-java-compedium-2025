package inny_pakiet;

import obiektowe.Drzewo;

public class DostepyDemo {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo("świerk",true, 25.22);
        //drzewo.nazwa = "świerk";
//        drzewo.wysokoscMetry = 25.22;
//        drzewo.iglaste = true;
        drzewo.wyswietl();
    }
}

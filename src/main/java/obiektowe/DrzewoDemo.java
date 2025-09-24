package obiektowe;

import java.util.Random;

public class DrzewoDemo {
    public static void main(String[] args) {
        //System.out.println("*".repeat(7));
        Drzewo drzewo1 = new Drzewo("kasztan", false,45.512354 );
        //drzewo1.nazwa ="kasztan" ;
//        drzewo1.iglaste = false;
//        drzewo1.wysokoscMetry = 45.512354;
        Drzewo drzewo2 = new Drzewo( "jodła",true, 34.456432);
 //       drzewo2.nazwa = "jodła";
//        drzewo2.iglaste = true;
//        drzewo2.wysokoscMetry = 34.456432;

        //drzewo1 = new Random();

//        drzewo1.wyswietl();
//        drzewo2.wyswietl();
//        System.out.println(drzewo1.toString());
        System.out.println(drzewo1);
        System.out.println(drzewo2);

//        JOptionPane.showMessageDialog(null, drzewo1.dajTekstowaReprezentacje());
        drzewo1.setHeight(drzewo1.getWysokoscMetry() + 2); //kod lamiacy zasade enkapsulacji
        System.out.println(drzewo1);
        drzewo1.urosnij(2);// kod traktujący obiekt jako autonomicznego aktora
    }
}

//enkapsulacja/hermetyzacja - z obiektem komunikujemy się wyłącznie przez jego metody, stan(pola) są całkowicie ukryte


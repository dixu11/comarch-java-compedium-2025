package obiektowe.poczta;

public class PocztaDemo3 {
    public static void main(String[] args) {
        List list1 = new List(new Adres("wojska polskiego", "7", "77-777"),
                new Adres("Jana Pawła II", "10", "10-222")
        );
        List list2 = new List(new Adres("wojska", "7", "77-777"),
                new Adres("Jana", "10", "10-222")
        );
        System.out.println(list1);
        Poczta poczta = new Poczta();
        boolean wyslany = poczta.wyslij(list1);
        boolean wyslany2 = poczta.wyslij(list2);
        System.out.println(wyslany);
        System.out.println(wyslany2);
        System.out.println(poczta);

        poczta.wyslijListonosza();
        System.out.println(poczta);
    }
}

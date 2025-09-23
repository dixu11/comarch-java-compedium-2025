package proceduralne;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Random;

public class ZwracanieIPrzyjmowanie {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 11);
        System.out.println(number);
       String przywitanie1 =  przywitaj("Rafał",2);
      String przywitanie2 =  przywitaj("Ewa",3);

//        JOptionPane.showMessageDialog(null,przywitanie1);
//        JOptionPane.showMessageDialog(null,przywitanie2);

        przywitaj(new String[]{"Ala","Ania","Adam"});
        przywitaj("Ala","Adam");
        przywitaj("Ala","Adam","Ania","Andrzej");
        //varargs

    }

    public static String przywitaj(String name, int ileRazy) {
        String greeting = "";
        for (int i = 0; i < ileRazy; i++) {
            greeting += "Hello " + name + ".";
        }
        return greeting.toUpperCase();
    }

    // public static void przywitaj(String[] names) {
    public static void przywitaj(String... names) {
        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }





}

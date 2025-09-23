package proceduralne;

import javax.swing.*;
import java.util.Random;

public class ZwracanieIPrzyjmowanie {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 11);
        System.out.println(number);
       String przywitanie1 =  przywitaj("Rafał",2);
      String przywitanie2 =  przywitaj("Ewa",3);

        JOptionPane.showMessageDialog(null,przywitanie1);
        JOptionPane.showMessageDialog(null,przywitanie2);
    }

    public static String przywitaj(String name, int ileRazy) {
        String greeting = "";
        for (int i = 0; i < ileRazy; i++) {
            greeting += "Hello " + name + ".";
        }
        return greeting.toUpperCase();
    }



}

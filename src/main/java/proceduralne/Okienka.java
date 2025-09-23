package proceduralne;

import javax.swing.*;

public class Okienka {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");
        String numberAsString = JOptionPane.showInputDialog("Podaj liczbę:");
        System.out.println("Podano: " +numberAsString);
        //Byte, Short, Integer, Long, Float, Double, Character, Boolean
        int number = Integer.parseInt(numberAsString);
        double result = Math.pow(number,2);
        JOptionPane.showMessageDialog(null, "Twoja liczba do 2 potęgi:" +
               + result );
    }
}

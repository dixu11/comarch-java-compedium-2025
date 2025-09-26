package zaawansowane.funkcyjne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class OkienkaPrzyklad {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Okienko");
        frame.setVisible(true);
        frame.setSize(200, 100);
        JButton jButton = new JButton("Naciśnij");
        frame.add(jButton);
        jButton.addActionListener(e -> jButton.setText("" + new Random().nextInt(1,11)));
    }
}

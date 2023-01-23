import javax.swing.*;

import static javax.swing.JFrame.*;

public class Main {
    public static void main(String[] args) {
        SelectionMetod selectionMetod = new SelectionMetod();
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Matematica");
        jFrame.setBounds(520, 250, 500, 300);


        System.out.println("Selective Algebra sau Geometrie:");
        selectionMetod.Compare();
    }
}
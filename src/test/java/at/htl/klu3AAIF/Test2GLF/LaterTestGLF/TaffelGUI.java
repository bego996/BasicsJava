package at.htl.klu3AAIF.Test2GLF.LaterTestGLF;

import javax.swing.*;

public class TaffelGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Durchfahrt Verboten!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingPanel panel = new DrawingPanel();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

}

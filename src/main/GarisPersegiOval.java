package main;

import java.awt.Color;

import javax.swing.JFrame;

public class GarisPersegiOval {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menggambar Garis, Persegi Panjang, dan Oval");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GarisPersegiOvalJPanel garisPersegiOvalJPanel = new GarisPersegiOvalJPanel();
        garisPersegiOvalJPanel.setBackground(Color.WHITE);
        frame.add(garisPersegiOvalJPanel);
        frame.setSize(600, 210);
        frame.setVisible(true);
    }
}

package com.stallmania.pack;

import javax.swing.JOptionPane;

public class BoiteDeDialog {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog(null, "Nom:");
        String message = String.format("salut %s comment va tu ?", nom);
        JOptionPane.showMessageDialog(null, message, "Warning", 2);
    }
}

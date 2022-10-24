package com.stallmania.pack;

import javax.swing.JOptionPane;

public class TotalDeuxNombreDialog {
    public static void main(String[] args) {
        int stNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "entrer le 1er nombre:"));
        int ndNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "entrer le 2eme nombre:"));

        int Total = stNumber + ndNumber;
        String message = String.format("l'addition de %d et de %d est %d",stNumber,ndNumber,Total);

        JOptionPane.showMessageDialog(null,message,"Le total ",1);
    }
}
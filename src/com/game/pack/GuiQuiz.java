package com.game.pack;

import javax.swing.JOptionPane;

public class GuiQuiz extends Quiz{
    

    public GuiQuiz(int numberOfQuestions) {
        super(numberOfQuestions);
    }

    @Override
    public void displayMessage(String GUImessage) {
        JOptionPane.showMessageDialog(null, GUImessage);
    }

    @Override
    public int retreiveAnser(int GUIInt) {
        return JOptionPane.showInputDialog(GUIInt);
    }
}

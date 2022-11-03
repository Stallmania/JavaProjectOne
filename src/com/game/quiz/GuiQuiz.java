package com.game.quiz;

import javax.swing.JOptionPane;

public class GuiQuiz extends Quiz {

    public GuiQuiz(int numberOfQuestion) {
        super(numberOfQuestion);
    }

    @Override
    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String retreiveAnser(String question) {
        return JOptionPane.showInputDialog(question);
    }
}

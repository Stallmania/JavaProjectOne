package com.game.quiz;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz {

    Scanner clavier = new Scanner(System.in);

    public ConsoleQuiz(int numberOfQuestion) {
        super(numberOfQuestion);

    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String retreiveAnser(String question) {
        displayMessage(question);
        return clavier.nextLine();
    }
}

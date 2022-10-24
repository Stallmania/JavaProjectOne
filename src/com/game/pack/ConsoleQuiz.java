package com.game.pack;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz {

    Scanner clavier = new Scanner(System.in);

    public ConsoleQuiz(int numberOfQuestions) {
        super(numberOfQuestions);
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public int retreiveAnser() {
        return clavier.nextInt() ;
    }

}

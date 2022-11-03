package com.game.quiz;

public class QuizMain {
    public static void main(String[] args) {
        //ConsoleQuiz quiz = new ConsoleQuiz(5);
        Quiz quiz = new GuiQuiz(4);
        quiz.start();
        quiz.displayResults();
    }
}
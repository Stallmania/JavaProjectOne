package com.game.pack;

public class QuizMain {
    public static void main(String[] args) {
        /* Quiz quiz = new ConsoleQuiz(new CapitalCityQuestionGenerator(5));
        Quiz quiz = new ConsoleQuiz(new MathyQuestionGenerator(3));
        Quiz quiz = new GuiQuiz(new MathyQuestionGenerator(3));
        quiz.start;
        quiz.displayResults(); */

        Quiz quiz = new Quiz();
        quiz.start();
    }
}
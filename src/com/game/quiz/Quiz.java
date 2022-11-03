package com.game.quiz;

import java.util.ArrayList;
import java.util.Random;
import com.game.utils.TimeConverter;


abstract public class Quiz {
    private int numberOfQuestion;
    private int score;
    private long timeElapsed;
    private boolean done = false;

    public Quiz(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    abstract public void displayMessage(String message);

    abstract public String retreiveAnser(String question); // display a question and return a response

    public void start() {
        try {
            long startTime = System.currentTimeMillis();
            for (Question question : generate(numberOfQuestion)) {

                String userAnswer = retreiveAnser(question.getQuestionText());
                if (userAnswer.equalsIgnoreCase(question.getReponse())) {
                    score++;
                    displayMessage("Bonne reponse");
                } else {
                    displayMessage("oops !! mauvaise reponse, c'est "+question.getReponse());
                }
            }
            done = true;
            long endTime = System.currentTimeMillis();

            timeElapsed = endTime - startTime;
        } catch (IllegalArgumentException e) {
            done = false;
            displayMessage(e.getMessage());
        }
    }

    public ArrayList<Question> generate(int numberOfQuestion) {

        String[][] data = getData();

        if (numberOfQuestion > getData().length) {
            throw new IllegalArgumentException("il n'y a que " + data.length + " questions disponible");
        }

        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Integer> noRepeatedList = new ArrayList<>();

        int index;

        for (int i = 0; i < numberOfQuestion; i++) {

            do {
                Random ran = new Random();
                index = ran.nextInt(data.length);

            } while (noRepeatedList.contains(index));

            noRepeatedList.add(index);

            String pays = data[index][0];
            String capitale = data[index][1];
            String questionText = String.format("Quel est la capital de ce pays :%s ", pays);

            questions.add(new Question(questionText, capitale));
        }

        return questions;
    }

    private static String[][] getData() {
        String[][] data = { { "France", "Paris" }, { "Algerie", "Alger" }, { "Maroc", "Rabat" }, { "Egypt", "Cairo" },
                { "Allemagne", "Berlin" } };
        return data;
    }

    public void displayResults() {
        if (done) {
            displayMessage("votre score est de " + score + "/" + numberOfQuestion + "et un temps de " + TimeConverter.toSeconds(timeElapsed) + " secondes");
        }
    }
}
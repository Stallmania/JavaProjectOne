package com.game.pack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public  class Quiz {

    /* int [][] duo = {{3,6},{4,9},{4,5},{1,10},{3,8},{15,3},{14,3},{7,2},{2,6},{7,3}};
    String [] operators = {"+","-","*"};
    
    int operatorIndex;
    int res;*/
    private int score; 
    private long timeElapsed; 
    private static final int NOMBRE_OF_QUESTIONS = 4; 
    private boolean done = false;
    Scanner clavier = new Scanner(System.in);

    public void start(){
        try {
            long startTime = System.currentTimeMillis();
            for (Question question : generate(NOMBRE_OF_QUESTIONS)) {
                System.out.println(question.getQuestionText());
                String userAnswer  = clavier.nextLine();
                if (userAnswer.equalsIgnoreCase(question.getReponse()) ) {
                    score++;
                    System.out.println("Bonne reponse");
                }else{
                    score--;
                    System.out.println("mauvaise reponse");
                    System.out.println(question.getReponse());
                }
                System.out.println("-------------------------");
            }
            done = true;
            long endTime = System.currentTimeMillis();

            timeElapsed = endTime - startTime;
        } catch (IllegalArgumentException e) {
            done = false;
            System.out.println(e.getMessage());
        }
        
        displayResults();
    }


    public ArrayList<Question> generate(int NOMBRE_OF_QUESTIONS){
        
        String [][] data = getData();

        if (NOMBRE_OF_QUESTIONS > getData().length) {
            throw new IllegalArgumentException("il n'y a que "+data.length+" questions disponible");
        }

        ArrayList <Question> questions = new ArrayList<>();
        ArrayList<Integer> noRepeatedList = new ArrayList<>();

        int index;
        
        for (int i = 0; i < NOMBRE_OF_QUESTIONS; i++) {

            do{
                Random ran = new Random();
                index = ran.nextInt(data.length);

            }while(noRepeatedList.contains(index));
            noRepeatedList.add(index);

            String pays = data[index][0];
            String capitale = data[index][1];
            String questionText = String.format("Quel est la capital de ce pays :%s ",pays);

            questions.add(new Question(questionText, capitale));
        }

        return questions;
    }

    private static String[][]getData(){
        String[][]data = {{"France","Paris"},{"Algerie","Alger"},{"Maroc","Rabat"},{"Egypt","Cairo"},{"Allemagne","Berlin"}};
        return data;
    }

    private int getTimeElapsedInSeconds(long timeInMilliseconds) {
        return (int) timeInMilliseconds/1000;
    }

    public void displayResults(){
        if (done) {
            System.out.printf("votre score est de %d/%d\n",score,NOMBRE_OF_QUESTIONS);
            System.out.printf("votre temps %d secondes",getTimeElapsedInSeconds(timeElapsed));
        }

    }
}

package com.game.pack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Quiz {

    int [][] duo = {{3,6},{4,9},{4,5},{1,10},{3,8},{15,3},{14,3},{7,2},{2,6},{7,3}};
    String [] operators = {"+","-","*"};
    int operatorIndex;
    int res;
    int score;

    public Quiz(int numberOfQuestions){

        ArrayList <Integer> myList = new ArrayList<>();

        NoRepeatRandomGenerator noR = new NoRepeatRandomGenerator();
        myList = noR.NoRepeatList(numberOfQuestions, duo.length); 

        Scanner enter = new Scanner(System.in);
        
        for (int i = 0; i < myList.size(); i++) {
            Random ran = new Random();
            operatorIndex = ran.nextInt(3);
            
            displayMessage("Quel est le resultat de cette operation mathematique ? " + duo[myList.get(i)][0] + operators[operatorIndex] + duo[myList.get(i)][1]);

            retreiveAnser();
            
            if(operators[operatorIndex] == "+"){
                res = (duo[myList.get(i)][0]) + (duo[myList.get(i)][1]);
            }else if (operators[operatorIndex] == "-") {
                res = (duo[myList.get(i)][0]) - (duo[myList.get(i)][1]);
            } else {
                res = (duo[myList.get(i)][0]) * (duo[myList.get(i)][1]);
            }
            if (res == retreiveAnser()) {
                displayMessage("Correct");
                score++;
            }else{
                displayMessage("faux !!");
            }
        }
        displayMessage("Votre score est de : "+score+" sur "+numberOfQuestions);
        enter.close();
    }

    public abstract void displayMessage(String message);

    public abstract int retreiveAnser();
}

package com.game.pack;

import java.util.ArrayList;
import java.util.Random;

public class NoRepeatRandomGenerator {

    public ArrayList <Integer> NoRepeatList(int nbOfElements, int maxBound){

        ArrayList <Integer> noRepat = new ArrayList<>();
        int n;
        for (int i = 0; i < nbOfElements; i++) {
            do{
                Random ran = new Random();
                n = ran.nextInt(maxBound);
            }while(noRepat.contains(n));
            noRepat.add(n);
        }
        return noRepat;
    }
}

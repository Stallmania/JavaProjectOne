package com.stallmania.pack;

public class shape {

    public static void main(String[] args) {
        
        Forme shapeA = new Cercle();
        System.out.println(shapeA.surface());
        
        Forme shapeC = new Care("tata",10);
        System.out.println(shapeC.surface());
        
        Forme shapeB = new Care("tata",12.5,8);
        System.out.println(shapeB.surface());

    }

}

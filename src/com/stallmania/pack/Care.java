package com.stallmania.pack;

public class Care extends Forme{
    private double cote = 4.3;
    private String text;
    private int moyenne;

    /* public Care(){
        super("je suis un caré");
    } */
    
    public Care(String text, double cote){
        this.text = text;
        this.cote = cote;

    }
    
    public Care(String text, double cote, int moyenne){
        this(text, cote);
        this.moyenne = moyenne;
        System.out.println(this.moyenne/2);
    }

    @Override
    public double surface() {
        return cote * cote;
    }
    
}

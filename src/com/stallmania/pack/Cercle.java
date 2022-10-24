package com.stallmania.pack;

public class Cercle extends Forme {
    private double r = 11.5;

    /* public Cercle(){
        super("Je suis un cercle");
        System.out.println("propriete parent X propriete fils (super.pro * this.r): "+super.pro * this.r); 
    } */

    @Override // une nouvelle definition de la methode
    public double surface() {
        return (Math.PI * this.r * this.r);
    };
}

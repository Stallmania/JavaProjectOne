package com.stallmania.pack;

public class Cli {
    public static void main(String[] args) {
        Bank cli = new Bank("Amine", "AB12G20FR12", 3021);
        
        System.out.println(cli.getSolde());
        System.out.println(cli); // appele ala methode toString
        System.out.println(String.valueOf(45)); // conversion de int --> String
        System.out.println(Double.valueOf("33")); // conversion de String --> Double

    }
}

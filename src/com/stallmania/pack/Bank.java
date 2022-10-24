package com.stallmania.pack;

public class Bank {
    private String name;
    private String numerCompte;
    private int solde;

    public Bank(String name, String numerCompte, int solde){
        this.name = name;
        this.numerCompte = numerCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        
        return String.format("Compte bancaire de %s numero %s solde: %d" ,name, numerCompte, solde);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNumerCompte(String numerCompte) {
        this.numerCompte = numerCompte;
    }
    public String getNumerCompte() {
        return numerCompte;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
    public int getSolde() {
        return solde;
    }
}

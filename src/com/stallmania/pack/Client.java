package com.stallmania.pack;

public class Client {
    private String name;
    private Integer numero;
    private Integer age;
    public static final int NOMBRE_OREILLES = 2;

    static protected int nombreDEPersonnes;

    public Client(String nom,  Integer num){
        this.name = nom;
        this.numero =  num;
        nombreDEPersonnes++;
        nombreDEPersonnesFoixDeux();
    }

    public void setAge(int age){

        if(age < 15){
            throw new IllegalAccessError("Age doit etre plus de 15 ans");
        }else{
            this.age=age;
        }
    }

    public Integer getAge() {
        return age;
    }

    public static int nombreDEPersonnesFoixDeux(){
        return nombreDEPersonnes*2;
    }

    public void afficheMessage() {
        System.out.println("bienvenue: "+ this.name + " age :" + age);
        System.out.println("votre numero est :" + numero);
    }
    
}

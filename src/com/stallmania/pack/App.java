package com.stallmania.pack;

public class App {
    public static void main(String[] args) throws Exception {
        Client ta = new Client("Amine", 45665);
        Client to = new Client("Maria", 454005);
        Client ti = new Client("Lamia", 4565);

        System.out.println("nombre de personnes: "+ Client.nombreDEPersonnes);
        System.out.println("nombre de personnes foix 2 est: "+ Client.nombreDEPersonnesFoixDeux());
        System.out.println("nombre des oreilles: "+ Client.NOMBRE_OREILLES);
        
        try{

            ta.setAge(16);
            ta.afficheMessage();
            
            to.setAge(12);
            to.afficheMessage();

            ti.setAge(65);
            ti.afficheMessage();
        }catch(IllegalAccessError e){
            e.getMessage();
        }


        System.out.println(ta.getAge());
    }
}

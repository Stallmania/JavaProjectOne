package com.stallmania.pack;

public class AnimalMain {
    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.communiquer();

        Animal chien = new Chien();
        chien.communiquer();
    }
}

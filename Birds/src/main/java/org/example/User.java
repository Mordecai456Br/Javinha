package org.example;

import java.util.ArrayList;


public class User {

    String name;
    ArrayList<String> birds;
    int feathers;
    String password;

    private static ArrayList<User> users = new ArrayList<>();

    private User(String name, String password){
        this.name = name;
        this.birds = new ArrayList<>();
        this.feathers = 0;
        this.password = password;

        users.add(this);
    }

    public static User createUser(String name, String password){
        for (User user : users){
            if (user.name.equals(name)) {
                System.out.println("Usuário " + name + " já existe, tente outro nome.");
                return null;
            }
        }
        System.out.println("Usuário " + name + " Criado!");
        return new User(name, password);
    }

}

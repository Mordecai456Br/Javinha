package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        boolean isLogged = false;

        User user1 = User.createUser("Gabriel", "senha123");
        User user2 = User.createUser("Ana", "senha123");
        User user3 = User.createUser("Ana","senha123");

        ArrayList<String> myBirds = new ArrayList<>();
        myBirds.add("Mordecai");
        myBirds.add("Pica-Pau");
        myBirds.add("Bem-Te-Vi");
        myBirds.add("Galinha-Pintadinha");
        myBirds.add("Galo-Carijó");

        for (String birds : myBirds) {
            IO.println(birds);
        }

        Bird myBird = new Bird("Mordecai", 2);

        IO.println(myBird.pet(3, null));

    }
}

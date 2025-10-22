package org.example;

import java.time.LocalDate;
import java.util.ArrayList;


/*
Usuário tem inventário com suas aves.
Aves são obtidas com ovos
Ovos são obtidos com penas
Aves recebem upgrade de feathersPerPet com penas
Penas são a moeda.

 */
public class Main {
    static void main() {
        LocalDate tonightIsTheNight = LocalDate.now();
        LocalDate yesterdayWasNotTheNight = (LocalDate.now().minusDays(1));
        int differenceDays = tonightIsTheNight.compareTo(yesterdayWasNotTheNight);
        System.out.println(differenceDays);

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
            System.out.println(birds);
        }

        Bird myBird = new Bird("Mordecai", 2);

        System.out.println(myBird.pet(3, null));

    }
}

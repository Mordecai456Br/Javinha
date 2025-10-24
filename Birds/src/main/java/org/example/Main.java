package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/*
Usuário tem inventário com suas aves e penas ✅;
Aves são obtidas com ovos;
Ovos são obtidos com penas;
Aves recebem upgrade de feathersPerPet com penas;
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

        Set<String> myBirds = new HashSet<>();
        myBirds.add("Mordecai");
        myBirds.add("Pica-Pau");
        myBirds.add("Pica-Pau");
        myBirds.add("Bem-Te-Vi");
        myBirds.add("Bem-Te-Vi");
        myBirds.add("Galinha-Pintadinha");
        myBirds.add("Galinha-Pintadinha");
        myBirds.add("Galo-Carijó");

        System.out.println(myBirds);
    }
}

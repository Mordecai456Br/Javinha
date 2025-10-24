package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Aonde quero chegar?
User com inventário
Caixas de ovos para nascer novos passarinhos (comprados com penas)
Upgrades infinitos de geração de penas baseados em progressão também comprados com penas
 */
public class Main {
    static void main() {

        boolean isLogged = false;

        User user1 = User.createUser("Gabriel", "senha123");
        User user2 = User.createUser("Ana", "senha123");
        User user3 = User.createUser("Ana","senha123");

        /*ArrayList<String> myBirds = new ArrayList<>();

        for (String birds : myBirds) {
            System.out.println(birds);
        }
        */
        Bird myBird = new Bird("Mordecai", 2);

        System.out.println(myBird.pet(3, null));
        Set<String> myBirds = new LinkedHashSet<>();

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

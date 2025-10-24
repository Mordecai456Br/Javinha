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
        User user3 = User.createUser("Ana", "senha123");

        Set<String> myBirds = new HashSet<>();
        myBirds.add("Mordecai");

        myBirds.add("Bem-Te-Vi");
        myBirds.remove("Bem-Te-Vi");

        myBirds.add("Galo-Carijó");

        System.out.println(myBirds);
        System.out.println(myBirds.contains("Bem-Te-Vi"));
        System.out.println(myBirds.contains("---------"));

        Set<String> hipsterBirds = new HashSet<>(Set.of("Mordecai", "Pica-Pau", "Galinha-Pintadinha", "Carcará"));
        Set<String> almostHipsterBirds = new HashSet<>(Set.of("Galo-Carijó", "Bem-Te-Vi", "Galinha-Pintadinha"));

        Set<String> todosJuntos = new HashSet<>(hipsterBirds);
        todosJuntos.addAll(almostHipsterBirds);

        Set<String> intersecao = new HashSet<>(hipsterBirds);
        intersecao.retainAll(almostHipsterBirds);
        System.out.println(intersecao);

        Set<String> diferenca = new HashSet<>(hipsterBirds);
        diferenca.removeAll(almostHipsterBirds);
        System.out.println(diferenca);

    }
}

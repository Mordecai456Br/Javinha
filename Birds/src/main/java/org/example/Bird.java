package org.example;
/* colecionador come come fechou a coleção, coleciona besteira
 n gosta de album de figurinha
 nerd - gosta de alice in boderland
 rocket league, battle field, automobilismo com carro de verdade pequeno
 board games, cinéfilo, bota fogo. Futebol americano


*/

public class Bird {
    String name;
    int feathersPerPet;
    int feathersGenerated = 0;

    public Bird(String name, int feathersPerPet){
        this.name = name;
        this.feathersPerPet = feathersPerPet;
    }

    public void pet(int quantity){
        for (int i = 0; i < quantity; i++){
            feathersGenerated += feathersPerPet;
        }
    }
}


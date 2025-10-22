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
    int upgradeLevel;

    public Bird(String name, int feathersPerPet){
        this.name = name;
        this.feathersPerPet = feathersPerPet;
    }

    public String pet(int quantity, String user_id){
        if(user_id == null || user_id.isEmpty()){
            return "Invalid user ID";
        } else {
            int feathersPerPetMultiplier = 0;
            for (int i = 0; i < upgradeLevel; i++){
                feathersPerPetMultiplier += 0.1;
            }

        for (int i = 0; i < quantity; i++){
            feathersGenerated += feathersPerPet;
        }

        return (user_id + " peted " + name + " " + quantity + " times");
        }
    }
    // cada level aumenta 0.1 o multiplicador.
    // Quando for pet o passarinho deve adicionar o multiplicador
    public void upgrade(){
        feathersPerPet += upgradeLevel;
    }
}



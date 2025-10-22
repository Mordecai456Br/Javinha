package org.example;

import java.util.ArrayList;

public class Egg {
    double price;
    ArrayList<Bird> possibleBirds;
    int hatchingTime;
        enum Tier { COMMON, RARE, EPIC, LEGENDARY }

    public Egg (double price, ArrayList<Bird> possibleBirds, Tier tier){
            this.price = price;
            this.possibleBirds = possibleBirds;

    }
    public void createEgg(double price, ArrayList<Bird> possibleBirds, Tier tier){
        switch (tier){
            case COMMON:
                hatchingTime = 2;
                return;
                case RARE:
                hatchingTime = 2;
                return;
            case EPIC:
                hatchingTime = 2;
                return;
                case LEGENDARY:
                hatchingTime = 2;
                return;
        };
        
    }
}

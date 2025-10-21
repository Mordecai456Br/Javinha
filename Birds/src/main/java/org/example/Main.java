package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int myFeathers = 0;

        ArrayList<String> myBirds = new ArrayList<>();
        myBirds.add("Mordecai");
        myBirds.add("Pica-Pau");
        myBirds.add("Bem-Te-Vi");
        myBirds.add("Galinha-Pintadinha");
        myBirds.add("Galo-Carijó");

        /*for (int i = 0; i < myBirds.size(); i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println(myBirds.get(i));
        }
        */
        for (String birds : myBirds) {
            IO.println(birds);
        }
        Bird myBird = new Bird("Mordecai", 2);
        myBird.pet(3);
        IO.println(myBird.feathersGenerated);
    }
}

package com.elgo;

public class Soustraction implements  SpecificCommands {
    Specific commandMoins;

    int a, b;
    public  Soustraction(Specific sousCommand){
        commandMoins = sousCommand;
    }


    @Override
    public void Apply() {
        commandMoins.soustraction(a, b);
    }
}

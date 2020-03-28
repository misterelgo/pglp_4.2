package com.elgo;

public class Division implements  SpecificCommands {
    Specific divCommand;

    int a, b;

    public  Division(Specific divisionCommand){
        divCommand = divisionCommand;
    }


    @Override
    public void Apply() {
        divCommand.division(a, b);
    }
}

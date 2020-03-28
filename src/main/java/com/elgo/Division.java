package com.elgo;

public class Division implements  SpecificCommands {
    Specific divCommand;

    int a, b;

    public  Division(Specific divisionCommand, MoteurRPN moteurRPN){
        divCommand = divisionCommand;
    }


    @Override
    public void Apply() {
        divCommand.division(a, b);
    }

    @Override
    public Double calculations(Double a, Double b) {
        return null;
    }
}

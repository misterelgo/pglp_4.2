package com.elgo;

public class Multiplication implements SpecificCommands {
    Specific multCommand;

    int a, b;

    public  Multiplication(Specific multiplication){
        multCommand = multiplication;
    }


    @Override
    public void Apply() {
        multCommand.multiplication(a, b);
    }
}

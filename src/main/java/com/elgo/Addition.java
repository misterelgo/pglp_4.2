package com.elgo;

public class Addition implements SpecificCommands {


    Specific addCommand;

    int a, b;
    public  Addition(Specific additionCommand){
        addCommand = additionCommand;
    }


    @Override
    public void Apply() {
        addCommand.addition(a, b);
    }
}

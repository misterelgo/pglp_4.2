package com.elgo;

public class Quitting implements GenericCommands {

    Generic quitCommand;

    public Quitting(Generic exitCommand){
        quitCommand = exitCommand;
    }
    @Override
    public void Apply() {
        quitCommand.Quit();
    }
}

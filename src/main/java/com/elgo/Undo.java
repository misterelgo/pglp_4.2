package com.elgo;

public class Undo implements GenericCommands {

    Generic undoCommand;

    public  Undo(Generic ctlrC_Command){
        undoCommand = ctlrC_Command;
    }

    @Override
    public void Apply() {
        undoCommand.Undo();
    }
}

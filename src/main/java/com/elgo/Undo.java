package com.elgo;

import java.util.Stack;

public class Undo implements GenericCommands {

    private final Generic undoCommand;

    private final Stack <Double> history;

    private final MoteurRPN moteurRPN;

    public  Undo(Generic CommandUndo, Stack<Double> stack, MoteurRPN moteur){
        undoCommand = CommandUndo;
        history = stack;
        moteurRPN = moteur;
    }

    @Override
    public void Apply() {
        undoCommand.Undo(history, moteurRPN);
    }
}

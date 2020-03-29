package com.elgo;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class MoteurRPN extends Interpretateur {
    //Enregistrement des operandes
    //On utilise les piles au niveau de Interpretateur pour stocker les operandes
    protected Stack<Double> stack = new Stack<>();
    protected Stack<Double> history = new Stack<>();


    //Commandes specifiques pour les operations elementaires
    private  Specific specificPrograms = new Specific();

    private SpecificCommands plusOperand = new Addition(specificPrograms, this);
    private SpecificCommands minOperand = new Soustraction(specificPrograms, this);
    private SpecificCommands multOperand = new Multiplication(specificPrograms, this);
    private SpecificCommands divOperand = new Division(specificPrograms, this);

    //Generic commands
    private  Generic genericPrograms = new Generic();
    private GenericCommands quitCommand = new Quitting(genericPrograms);
    private GenericCommands undoCommand = new Undo(genericPrograms, this.history, this);

    //Interpreter instanciation
    private Interpretateur interpreter = new Interpretateur();

    //Initialisation avec les commandes necessaires
    public void moteurInit(){
        //init for Specific commands
        interpreter.registerCommand("+", plusOperand);
        interpreter.registerCommand("-", minOperand);
        interpreter.registerCommand("*", multOperand);
        interpreter.registerCommand("/", divOperand);
        //init for Generic commands
        interpreter.registerCommand("quit", quitCommand);
        interpreter.registerCommand("undo", undoCommand);

    }


    public void enregistrer(double operand){
        this.stack.push(operand);
    }

    public double depiler(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }else {
            this.history.push(stack.peek());
            return stack.pop();
        }
    }

    public void apply(String command) {
        interpreter.runCommand(command);
    }

    public void printStack(){
        System.out.printf("Current expression: \t");
        if (!this.stack.isEmpty()){
            for (int i = 0; i < this.stack.size(); i++){
                System.out.print(this.stack.elementAt(i)+"\t");
            }
        }
        System.out.println("");
    }


}

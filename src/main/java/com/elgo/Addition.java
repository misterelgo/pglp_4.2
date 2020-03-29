package com.elgo;

import java.util.EmptyStackException;

public class Addition implements SpecificCommands {

    private final Specific addCommand;
    private final MoteurRPN moteurRPN;

    public  Addition(Specific additionCommand, MoteurRPN moteur){
        addCommand = additionCommand;
        moteurRPN = moteur;
    }


    @Override
    public void Apply() {
        double a = 0;
        double b = 0;
        int empty = 0;
        try{
            a = moteurRPN.depiler();
            //System.out.println(a);
            empty++;
            b = moteurRPN.depiler();
            empty++;
            moteurRPN.enregistrer(this.calculations(b, a));
        }catch (EmptyStackException e){
            System.out.println("Operand missing!");
            if (empty == 1){
                moteurRPN.enregistrer(a);
            }
        }
    }

    @Override
    public double calculations(double a, double b) {
        return addCommand.addition(a, b);
    }
}

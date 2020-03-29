package com.elgo;

public class Division implements  SpecificCommands {
    private final Specific divCommand;
    private final MoteurRPN moteurRPN;

    int a, b;
    public  Division(Specific additionCommand, MoteurRPN moteur){
        divCommand = additionCommand;
        moteurRPN = moteur;
    }


    @Override
    public void Apply() {
        double a = 0;
        double b = 0;
        int empty = 0;
        try{
            a = moteurRPN.depiler();
            empty++;
            b = moteurRPN.depiler();
            moteurRPN.enregistrer(this.calculations(b, a));
        }catch (Exception e){
            System.out.println("Operand missing");
            if (empty == 1){
                moteurRPN.enregistrer(a);
            }
        }
    }

    @Override
    public double calculations(double a, double b) {
        return divCommand.division(a, b);
    }
}

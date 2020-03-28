package com.elgo;

public class Soustraction implements  SpecificCommands {
    private final Specific minusCommand;
    private final MoteurRPN moteurRPN;

    int a, b;
    public  Soustraction(Specific additionCommand, MoteurRPN moteur){
        minusCommand = additionCommand;
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
        return minusCommand.soustraction(a, b);
    }
}

package com.elgo;

public class Multiplication implements SpecificCommands {
    private final Specific multCommand;
    private final MoteurRPN moteurRPN;

    int a, b;
    public  Multiplication(Specific additionCommand, MoteurRPN moteur){
        multCommand = additionCommand;
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
        return multCommand.multiplication(a, b);
    }
}

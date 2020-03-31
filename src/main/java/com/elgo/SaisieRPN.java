package com.elgo;
import java.util.*;
public class SaisieRPN {
    private Scanner input = new Scanner(System.in);
    private  MoteurRPN moteurRPN = new MoteurRPN();
    private String inputValue =  new String();

    public void acceuil(){
        moteurRPN.moteurInit();
        System.out.printf("Enter an operand or command : ");
        do {
            this.inputValue = input.nextLine();
            if (verifInput(inputValue)== false){
                moteurRPN.apply(inputValue);
            }else {
                //System.out.println(Double.parseDouble(inputValue));
                moteurRPN.enregistrer(Double.parseDouble(inputValue));
            }
            moteurRPN.printStack();
        }while (true);

    }

    private boolean verifInput(String value){
        double verif;
        try {
            verif = Double.parseDouble(value);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}

package com.elgo;
import java.util.*;
public class SaisieRPN {
    private static Scanner input = new Scanner(System.in);
    private  MoteurRPN moteurRPN = new MoteurRPN();
    private String inputValue =  new String();

    public void acceuil (){
        moteurRPN.moteurInit();

        do {
            inputValue = input.nextLine();
            if (verifInput(inputValue)== false){
                moteurRPN.apply(inputValue);
            }else {
                moteurRPN.enregistrer(Double.parseDouble(inputValue));
            }
            moteurRPN.affiche();
        }while (true);

    }

    private boolean verifInput(String value){
        try {
            double check = Double.parseDouble(value);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}

package com.elgo;

import java.util.Stack;

public class Generic {

    public void Quit() {
        System.out.println(" You are quitting the program! ");
        System.exit(0);
    }


    public void Undo(Stack<Double> history, MoteurRPN moteur) {
        System.out.println(" You are doing a Ctrl C bruhh! ");
        int i = 0;
        if (history.size()>1){
            moteur.depiler();
            history.remove(history.size()-1);
            while (i < 2){
                moteur.enregistrer(history.pop());
                i++;
            }
            while (!history.empty()){
                history.pop();
            }
        }

    }
}

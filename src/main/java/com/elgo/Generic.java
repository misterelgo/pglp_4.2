package com.elgo;

import java.util.Stack;

public class Generic {

    public void Quit() {
        System.out.println(" Good bye! Thanks Dude ");
        System.exit(0);
    }


    public void Undo(Stack<Double> history, MoteurRPN moteur) {
        System.out.println(" You canceled your last operation ");
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

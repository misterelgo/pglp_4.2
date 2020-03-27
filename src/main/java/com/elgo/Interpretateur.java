package com.elgo;

import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.util.Stack;

public class Interpretateur {


    private int a, b;

    private final HashMap<String, Commands> commandMap = new HashMap<>();

    private Stack<Integer> pile = new Stack<>();

    public void registerCommand(String commandName, Commands command){
        commandMap.put(commandName, command);
        System.out.println(" The command added is: " + commandName);
    }

    public void addToStack(int a){
        pile.push((int) a);
    }

    public void runCommand(String commandName){
        Commands command = commandMap.get(commandName);
        if (command == null){
            throw new IllegalStateException(" No command registered for " + commandName);
        }
        else {
            command.Apply();
        }
    }
}

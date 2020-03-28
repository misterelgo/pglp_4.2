package com.elgo;

import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.util.Stack;

public class Interpretateur {

    private int a, b;

    protected final HashMap<String, Commands> commandMap = new HashMap<>();

    protected Stack<Integer> pile = new Stack<>();

    protected Stack <String> history = new Stack<>();

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

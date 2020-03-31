package com.elgo;

import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.util.Stack;

public class Interpretateur {

    private int a, b;

    protected final HashMap<String, Commands> commandMap = new HashMap<>();

    public void registerCommand(String commandName, Commands command){
        commandMap.put(commandName, command);
        //System.out.println(" The command added is: " + commandName);
    }

    public void runCommand(String commandName){
        Commands command = commandMap.get(commandName);
        //System.out.println(commandName);
        try {
            if (command == null){
                System.out.println("Invalid command! ");
                throw new IllegalStateException();
            }else {
                command.Apply();
            }

        }catch (IllegalStateException e){

        }
    }
}

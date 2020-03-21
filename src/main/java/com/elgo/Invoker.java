package com.elgo;

import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.util.Stack;

public class Invoker {
    private int a, b;

    private Stack <Double> pile = new Stack<>();

    private final HashMap<String, Commands> commandMap = new HashMap<>();

    public void register(String commandName, Commands command){
        commandMap.put(commandName, command);
    }

    public void execute(String commandName){
        Commands command = commandMap.get(commandName);
        if (command == null){
            throw new IllegalStateException("No command registered for " + commandName);
        }
        else {
            command.Apply();
        }
    }
}

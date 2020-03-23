package com.elgo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Generic newCommand = commandType.getCommandType();

        GenericCommands quitProgram = new Quitting(newCommand);

        //testing the undo command
        GenericCommands undoCommand = new Undo(newCommand);

        Interpretateur genCommand = new Interpretateur();

        genCommand.registerCommand("undo", undoCommand);
        genCommand.runCommand("undo");

        //genCommand.registerCommand("quit", quitProgram);

        //genCommand.runCommand("quit");
    }
}

package by.bsuir.secondLab.controller;

import by.bsuir.secondLab.controller.command.Command;

public class Controller {
    private final CommandProvider provider = new CommandProvider();
    private final char paramDelimeter = ' ';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;
        commandName = request;
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }

}

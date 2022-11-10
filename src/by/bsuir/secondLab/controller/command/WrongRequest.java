package by.bsuir.secondLab.controller.command;

public class WrongRequest implements Command{
    @Override
    public String execute(String request) {
        return "error";
    }
}

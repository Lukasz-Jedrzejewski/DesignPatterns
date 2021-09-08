package com.legion.command.commandExercise.compositeCommand;

import com.legion.command.commandExercise.command.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}

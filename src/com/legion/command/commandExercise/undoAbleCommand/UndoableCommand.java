package com.legion.command.commandExercise.undoAbleCommand;

import com.legion.command.commandExercise.command.Command;

public interface UndoableCommand extends Command {
    void unExecute();
}

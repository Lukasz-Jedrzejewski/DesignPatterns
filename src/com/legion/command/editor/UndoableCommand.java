package com.legion.command.editor;

public interface UndoableCommand extends Command {
    void unExecute();
}

package com.legion.command.commandExercise.undoAbleCommand;

import com.legion.command.commandExercise.components.Model;

public class UpperCaseLettersCommand implements UndoableCommand {

    private String previousContent;
    private Model model;
    private History history;

    public UpperCaseLettersCommand(Model model, History history) {
        this.model = model;
        this.history = history;
    }

    @Override
    public void unExecute() {
        model.setText(previousContent);
    }

    @Override
    public void execute() {
        previousContent = model.getText();
        model.makeLettersUpperCase();
        history.push(this);
    }
}

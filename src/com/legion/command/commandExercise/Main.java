package com.legion.command.commandExercise;

import com.legion.command.commandExercise.command.*;
import com.legion.command.commandExercise.components.*;
import com.legion.command.commandExercise.compositeCommand.CompositeCommand;
import com.legion.command.commandExercise.undoAbleCommand.History;
import com.legion.command.commandExercise.undoAbleCommand.UndoCommand;
import com.legion.command.commandExercise.undoAbleCommand.UpperCaseLettersCommand;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        System.out.println("Command design pattern");
        ActionCommand actionCommand = new ActionCommand();
        Button actionButton = new Button(actionCommand);
        actionButton.click();
        System.out.println("***");

        System.out.println("Composite command design pattern");
        CompositeCommand compositeCommand = new CompositeCommand();
        Model model = new Model();
        UUIDService service = new UUIDService();
        compositeCommand.add(new AddUuidCommand(model, service));
        compositeCommand.add(new RemoveCharactersCommand(model));
        compositeCommand.add(new AdditionCommand(model));
        Button compositeButton = new Button(compositeCommand);
        compositeButton.click();
        System.out.println("***");

        System.out.println("Undoable command design pattern");
        History history = new History();
        Model model1 = new Model();
        model1.setText(UUID.randomUUID().toString());
        System.out.println(model1.getText());
        UpperCaseLettersCommand upperCaseLettersCommand = new UpperCaseLettersCommand(model1, history);
        Button upperCaseButton = new Button(upperCaseLettersCommand);
        upperCaseButton.click();
        System.out.println(model1.getText());
        UndoCommand undoCommand = new UndoCommand(history);
        Button undoButton = new Button(undoCommand);
        undoButton.click();
        System.out.println(model1.getText());
    }
}

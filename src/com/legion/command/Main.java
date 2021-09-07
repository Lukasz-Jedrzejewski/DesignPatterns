package com.legion.command;

import com.legion.command.editor.BoldCommand;
import com.legion.command.editor.History;
import com.legion.command.editor.HtmlDocument;
import com.legion.command.editor.UndoCommand;
import com.legion.command.fx.Button;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        System.out.println("Command");
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
        System.out.println("***");

        System.out.println("Composite command");
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.execute();
        System.out.println("***");

        System.out.println("Undoable command");
        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello");
        BoldCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println(htmlDocument.getContent());
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlDocument.getContent());
    }
}

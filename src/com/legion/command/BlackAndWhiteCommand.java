package com.legion.command;

import com.legion.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}

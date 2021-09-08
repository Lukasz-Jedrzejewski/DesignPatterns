package com.legion.command.commandExercise.components;

import com.legion.command.commandExercise.command.Command;

import java.util.Arrays;
import java.util.UUID;

public class ActionCommand implements Command {

    @Override
    public void execute() {
        String text = UUID.randomUUID().toString();
        Integer sum = Arrays.stream(text.split(""))
                .filter((s) -> s.matches("\\d"))
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum);
    }
}

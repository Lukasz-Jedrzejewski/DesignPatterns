package com.legion.command.commandExercise.components;

import java.util.UUID;

public class UUIDService {

    public String create() {
        return UUID.randomUUID().toString();
    }
}

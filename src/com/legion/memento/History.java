package com.legion.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<MovieState> states = new ArrayList<>();

    public void push(MovieState state) {
        states.add(state);
    }

    public MovieState pop() {
        int lastIndex = states.size()-1;
        MovieState lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}

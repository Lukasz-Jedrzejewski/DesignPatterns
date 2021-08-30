package com.legion.memento;

public class MovieState {
    private final String title;
    private final String description;
    private final int rate;

    public MovieState(String title, String description, int rate) {
        this.title = title;
        this.description = description;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }
}

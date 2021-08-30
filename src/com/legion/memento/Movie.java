package com.legion.memento;

public class Movie {

    private String title;
    private String description;
    private int rate;

    public Movie(String title, String description, int rate) {
        this.title = title;
        this.description = description;
        this.rate = rate;
    }

    public MovieState createState() {
        return new MovieState(title, description, rate);
    }

    public void restore(MovieState state) {
        title = state.getTitle();
        description = state.getDescription();
        rate = state.getRate();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setValues(String title, String description, int rate) {
        this.title = title;
        this.description = description;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return title + ", " + description + ", " + rate;
    }
}

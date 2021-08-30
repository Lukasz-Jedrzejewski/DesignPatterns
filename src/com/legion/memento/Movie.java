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

    public EditorState createState() {
        return new EditorState(title, description, rate);
    }

    public void restore(EditorState state) {
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


}

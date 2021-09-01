package com.legion.iterator;

public class NamesHistory implements Iterator {

    private String[] names;
    private int index = 0;

    public NamesHistory(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if (index >= names.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object current() {
        return names[index];
    }

    @Override
    public void next() {
        index++;
    }
}

package com.legion.iterator;

public class Main {

    public static void main(String[] args) {

        ItemHistory history = new ItemHistory();
        history.push(new Item("a", 10));
        history.push(new Item("b", 20));
        history.push(new Item("c", 30));

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}

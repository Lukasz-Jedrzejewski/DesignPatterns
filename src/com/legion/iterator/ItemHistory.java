package com.legion.iterator;

import java.util.ArrayList;
import java.util.List;

public class ItemHistory {
    private List<Item> items = new ArrayList<>();

    public void push(Item item) {
        items.add(item);
    }

    public Item pop() {
        int lastIndex = items.size() - 1;
        Item lastItem = items.get(lastIndex);
        items.remove(lastItem);

        return lastItem;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Item> {

        private ItemHistory history;
        private int index;

        public ListIterator(ItemHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.items.size());
        }

        @Override
        public Item current() {
            return history.items.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}

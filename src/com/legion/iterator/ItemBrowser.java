package com.legion.iterator;

import java.util.ArrayList;
import java.util.List;

public class ItemBrowser {
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

    public List<Item> getItems() {
        return items;
    }
}

package com.booleanuk.core;

import java.util.*;

public class Basket {
    private List<String> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public List<String> getItems() {
        return this.items;
    }
}

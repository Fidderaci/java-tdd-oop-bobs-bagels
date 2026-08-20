package com.booleanuk.core;

import java.util.*;

public class Basket {

    private List<String> items;
    private int capacity;
    private Inventory inventory;

    public Basket() {
        this.items = new ArrayList<>();
        this.capacity = 0;
        this.inventory = new Inventory();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public boolean removeItem(String item) {
        return this.items.remove(item);
    }

    public List<String> getItems() {
        return this.items;
    }
    public void changeCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }
    public boolean isFull() {
        return this.capacity == this.items.size();
    }
    public float totalCost() {
        float totalCost = 0.0F;
        for (String item : this.items) {
            totalCost += this.inventory.getItemPrice(item);
        }
        return totalCost;
    }
    public void addFillingToBagel(String bagel, String filling){
        if (this.items.contains(bagel)){
            this.items.add(filling);
        }
    }
}


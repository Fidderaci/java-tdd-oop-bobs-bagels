package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Float> stock;

    public Inventory() {
        this.stock = new HashMap<>();

        //Bagels
        this.stock.put("BGLO", 0.49F);
        this.stock.put("BGLP", 0.39F);
        this.stock.put("BGLE", 0.49F);
        this.stock.put("BGLS", 0.49F);

        //Coffee
        this.stock.put("COFB", 0.99F);
        this.stock.put("COFW", 1.19F);
        this.stock.put("COFC", 1.29F);
        this.stock.put("COFL", 1.29F);

        //Fillings
        this.stock.put("FILB", 0.12F);
        this.stock.put("FILE", 0.12F);
        this.stock.put("FILC", 0.12F);
        this.stock.put("FILX", 0.12F);
        this.stock.put("FILS", 0.12F);
        this.stock.put("FILH", 0.12F);
    }
    public float getItemPrice(String item) {
        if (this.stock.containsKey(item)) {
            return this.stock.get(item);
        }
        return 0.0F;
    }
    public boolean isInMenu(String item){
        return this.stock.containsKey(item);
    }
}

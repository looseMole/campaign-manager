package com.loosemole.player.inventory;

import com.loosemole.common.item.Item;

import java.util.HashMap;

public class Inventory {
    public HashMap<Item, Integer> itemAmountMap;

    public Inventory() {
        this.itemAmountMap = new HashMap<>();
    }

    public void addItem(Item itemToAdd, int amount) {
        this.itemAmountMap.put(itemToAdd, amount);
    }

    // TODO: this.
}

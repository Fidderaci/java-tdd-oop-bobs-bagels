package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    //Test user story 1
    @Test
    public void testAddItemToBasket() {
        Basket basket = new Basket();
        basket.addItem("BGLO");

        Assertions.assertEquals(1, basket.getItems().size());
    }
    //test user story 2
    @Test
    public void testRemoveItemFromBasket() {
        Basket basket = new Basket();
        basket.addItem("BGLO");
        Assertions.assertEquals(1, basket.getItems().size());

        basket.removeItem("BGLO");
        Assertions.assertEquals(0, basket.getItems().size());
    }
    //test user story 3
    @Test
    public void testBasketIsFull() {
        Basket basket = new Basket();
        basket.changeCapacity(2);

        basket.addItem("BGLO");
        basket.addItem("BGLO");

        Assertions.assertTrue(basket.isFull());
    }
    //test user story 4
    @Test
    public void testChangeCapacityUpdateMaxCapacity() {
        Basket basket = new Basket();
        basket.changeCapacity(2);
        basket.addItem("BGLO");
        basket.addItem("BGLO");

        Assertions.assertTrue(basket.isFull());

        basket.changeCapacity(4);

        Assertions.assertFalse(basket.isFull());
    }
    //test user story 5
    @Test
    public void testRemoveNonexistentItem() {
        Basket basket = new Basket();
        basket.addItem("BGLM");

        boolean removeBagel = basket.removeItem("BGLO");

        Assertions.assertFalse(removeBagel);
        Assertions.assertEquals(1, basket.getItems().size());
    }
    //test user story 6
    @Test
    public void testGetTotalCost() {
        Basket basket = new Basket();

        basket.addItem("BGLO"); //0.49
        float totalCost1 = basket.totalCost();
        Assertions.assertEquals(0.49f, totalCost1);

        basket.addItem("BGLP"); //0.39
        float totalCost = basket.totalCost();
        Assertions.assertEquals(0.88f, totalCost);
    }
    //test user story 7
    @Test
    public void testGetPriceFromInventory() {
        Inventory inventory = new Inventory();
        float blackCoffePrice= inventory.getItemPrice("COFB");
        Assertions.assertEquals(0.99f, blackCoffePrice);
    }
    //test user story 8
    @Test
    public void testAddFillingToBasket() {
        Basket basket = new Basket();
        basket.addItem("BGLO");
        Assertions.assertEquals(1, basket.getItems().size());

        basket.addFillingToBagel("BGLO", "FILB");
        Assertions.assertEquals(2, basket.getItems().size());
        Assertions.assertTrue(basket.getItems().contains("FILB"));
    }

    //test user story 9
    @Test
    public void testGetPriceFromFilling() {
        Inventory inventory = new Inventory();
        float baconPrice = inventory.getItemPrice("FILB");
        Assertions.assertEquals(0.12f, baconPrice);

        float cheesePrice = inventory.getItemPrice("FILC");
        Assertions.assertEquals(0.12f, cheesePrice);
    }
    //test user story 10
    @Test
    public void testCheckIfItemExists() {
        Inventory inventory = new Inventory();

        boolean itemExists = inventory.isInMenu("BGLO");
        Assertions.assertTrue(itemExists);

        boolean doesNotExist = inventory.isInMenu("X");
        Assertions.assertFalse(doesNotExist);
    }

}
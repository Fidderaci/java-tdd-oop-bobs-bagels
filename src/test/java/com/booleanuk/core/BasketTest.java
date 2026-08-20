package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddItemToBasket() {
        Basket basket = new Basket();
        basket.addItem("BGLO");

        Assertions.assertEquals(1, basket.getItems().size());
    }

}
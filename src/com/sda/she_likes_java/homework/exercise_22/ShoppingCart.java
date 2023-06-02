package com.sda.she_likes_java.homework.exercise_22;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProductToBasket(Item product) {
        items.add(product);
    }

    public void displayProducts() {
        System.out.println("Items in shopping cart: " + items);
    }

    public double calculateTotalBasketValue() {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) { // items.size() - is like array.length, or number of elements inside the list
            sum += items.get(i).getPriceInUSD(); //same as sum = sum + items.get(i).getPriceInUSD();
        }

        return sum;
    }
}
package com.example.java;

import com.example.java.model.ClothingItem;
import com.example.java.model.Shirt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClothingItem item = new ClothingItem("Shirt", "L", 10.00);
        System.out.println(item);
        Shirt shirt = new Shirt("M", 14.99);
        System.out.println(shirt);
        shirt.setPattern("Plaid");
        System.out.println("The shirt's pattern is " + shirt.getPattern());
    }
}

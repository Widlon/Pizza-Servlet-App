/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nishu_widlon.assign1.model;

/**
 *
 * @author nishu
 */
public class PizzaOrder {
    

    private String size;
    private boolean delivery;
    private String[] toppings;

    public void setSize(String size) {
        this.size = size; }

    public String getSize() {
        return size;
    }

    public PizzaOrder() {
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public double getPrice() {
        double price = 0;
        if (isDelivery()) {
            price += 2;
        }

        if (getSize().equalsIgnoreCase("Small")) {
            price += 5;
        } else if (getSize().equalsIgnoreCase("Medium")) {
            price += 7;
        } else if (getSize().equalsIgnoreCase("Large")) {
            price += 9;
        }

        price += getToppings().length;
        return price;

    }
}    
    





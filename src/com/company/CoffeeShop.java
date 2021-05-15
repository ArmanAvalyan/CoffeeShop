package com.company;

import java.util.ArrayList;

public class CoffeeShop {

    private String name;
    private ArrayList<String> orders;
    private ArrayList<String[]> menuItem;


    public void addOrder(String name) {
        getOrders().add(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<String> orders) {
        this.orders = orders;
    }

    public ArrayList<String[]> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<String[]> menuItem) {
        this.menuItem = menuItem;
    }
}

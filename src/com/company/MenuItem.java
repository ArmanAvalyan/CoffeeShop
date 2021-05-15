package com.company;

import java.util.ArrayList;

public class MenuItem {

    private String name;
    private String type;
    private String price;

    public MenuItem(String name, String type, String price){
        setName(name);
        setType(type);
        setPrice(price);
    }


    public ArrayList<String> menuItem(String name, String type, String price) {
        ArrayList<String> menuItem = new ArrayList<>();
        menuItem.add(name);
        menuItem.add(type);
        menuItem.add(price);
        return menuItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

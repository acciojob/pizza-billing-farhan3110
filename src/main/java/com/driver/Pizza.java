package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheeseAdded;
    private Boolean extraToppingsAdded;
    private Boolean takeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? 300 : 400; // set the base price according to the type of pizza
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.extraCheeseAdded) {
            this.extraCheeseAdded = true;
            this.price += 80; // add the extra cheese price to the pizza's price
            this.bill += "80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.extraToppingsAdded) {
            this.extraToppingsAdded = true;
            int toppingsPrice = this.isVeg ? 70 : 120; // set the toppings price according to the type of pizza
            this.price += toppingsPrice; // add the toppings price to the pizza's price
            this.bill += toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!this.takeawayAdded) {
            this.takeawayAdded = true;
            this.price += 20; // add the paper bag price to the pizza's price
            this.bill += "20\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill =  this.bill +  this.price + "\n";
        return this.bill;
    }
}

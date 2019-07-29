package com.nicole;

public class BaseHamburger {

    private String rollType;
    private String  meat;
    private double price;
    private String name;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public BaseHamburger(String rollType, String meat, double price, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void addHamburgerAddition1(String name, double price){
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    //total price of the hamburger
    //including all the additional items
    public double itemizeHamburger(){
        //create a local variable
        //this.price => the basic price for the hamburger
        //that was passed to us in the constructor
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.rollType
                + " roll with  " + this.meat + " price is " + this.price);

        if(this.additionName1 != null){
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added " + this.additionName1 + " for an extra " + this.additionPrice1);
        }

        if(this.additionName2 != null){
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added " + this.additionName2 + " for an extra " + this.additionPrice2);
        }

        if(this.additionName3 != null){
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added " + this.additionName3 + " for an extra " + this.additionPrice3);
        }

        if(this.additionName4 != null){
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added " + this.additionName4 + " for an extra " + this.additionPrice4);
        }
        return hamburgerPrice;
    }
}

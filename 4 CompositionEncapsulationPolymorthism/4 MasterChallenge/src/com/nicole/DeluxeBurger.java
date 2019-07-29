package com.nicole;

public class DeluxeBurger extends BaseHamburger {

    public DeluxeBurger() {
        super("White", "Sausage and Bacon", 14.54, "Deluxe");

        //automatically add chips and drink additions at the time
        // the deluxe burger object is created
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    //prevent other additions being made
    //because we removed the super();

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}

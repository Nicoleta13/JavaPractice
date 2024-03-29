package com.nicole;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created.");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 228.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomer("Adelaide", false);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brain", 5.53)){
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists.");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
            System.out.println("Customer doesn't exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)){
            System.out.println("Customer Tim already exists");
        }



    }
}

package com.nicole;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //add a new customer with initial amount
    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null) {
            //daca nu gaseste clientul in lista cu clienti                             = this.customers
            //atunci in lista cu clienti se adauga un client now                       = add()
            //se creaza un obiect nou bazinduse pe constructorul din clasa Customer    = new Customer(customerName, initialAmount)
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    //add additional transactions for that customer/branch

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);

        //daca clientul cautat exista in lista
        if(existingCustomer != null) {

            //atunci la client se adauga suma indicata
            //se face apel la metoda din clasa Customer = addTransactions(amount)
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    //se creaza o metoda privata care este accesibila doar in clasa Branch
    //pentru a cauta un client in lista

    private Customer findCustomer(String customerName){

        //se verifica fiecare client dupa nume
        //incepand de la clientul cu indexul 0
        //pina la clientul cu indexul = lungimea listei
        for(int i=0; i < this.customers.size(); i++){

            //se intoarce elementul din pozitia i    = get(i)
            Customer checkedCustomer = this.customers.get(i);

            //si se verifica daca in elementul din pozitia i                                    = get(i)
            //numele din acest element (se face apel la metoda getName() din clasa Customers)   = getName()
            //este egal cu numele numele cautat                                                 = equals(customerName))
          if(this.customers.get(i).getName().equals(customerName)){
              return checkedCustomer;
          }
        }
        return null;
    }

}

package com.nicole;

import java.util.ArrayList;

public class Bank {

    private String name;

    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    //add a new branch
    public boolean addBranch(String branchName){

        //daca nu exista branch in lista de branch
        if(findBranch(branchName) == null) {

            //atunci se adauga un branch nou  = add()
            //adica se creaza un obiect nou in clasa Branch   = new Branch(branchName)
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    //// Add a customer to that branch with initial transaction
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);

        //daca sa gasit branch dupa numele de branch cautat
        if(branch != null) {

            //atunci la branch-ul gasit                            = branch
            //se face apel la metoda newCustomer din clasa Branch  = newCustomer(customerName, initialAmount)
            //care permite adaugarea unui client nou cu nume si initialamount
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    // Add a transaction for an existing customer for that branch
    public boolean addCustomerTransaction(String brachName, String customerName, double amount){
        Branch branch = findBranch(brachName);

        //daca sa gasit branch dupa numele de branch cautat
        if(branch != null) {

            //atunci la branch-ul gasit                 = branch
            //se face apel la metoda addCustomerTransaction din clasa Branch   = addCustomerTransaction(customerName, amount)
            //care adauga un client nou la acest branch, si suma indicata
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    //se creaza o metoda privata care este accesibila doar in clasa Bank
    //pentru a cauta un client dupa nume in lista in branch
    private Branch findBranch(String customerName){

        //pentru fiecare branch din lista cu branch-uri
        for(int i=0; i < this.branches.size(); i++){

            //se intoarce elementul din pozitia i    = get(i)
            Branch checkedBranch = this.branches.get(i);

            //si se verifica daca in elementul din pozitia i                                    = get(i)
            //numele din acest element (se face apel la metoda getName() din clasa Customers)   = getName()
            //este egal cu numele numele cautat
            if(this.branches.get(i).getName().equals(customerName)){
                return checkedBranch;
            }
        }
        return null;
    }


    // Show a list of customers for a particular branch
    // and optionally a list of their transactions

    public boolean listCustomer(String branchName, boolean showTransactions){

        //se cauta branch-ul indicat
        Branch branch = findBranch(branchName);

        //se verifica daca este in lista cu branch-uri
        if (branch != null){
            //daca este atunci se printeaza numele branch-ului pe ecran
            System.out.println("Customer details for branch " + branch.getName());

            //se face apel la lista cu clienti din clasa Branch
            //si se pastreaza in variabila branchCustomers  lista de clienti din branchul cautat
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            //pentru fiecare client din branchul cautat
            for (int i =0; i< branchCustomers.size(); i++){

                //se intoarce elementul din pozitia i    = get(i)
                Customer branchCustomer = branchCustomers.get(i);

                //se printeaza la ecran numele extras din elementul i plus pozitia elementului in lista(nu indexul)(i+1)
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");

                //daca este indicat true
                if(showTransactions){
                    System.out.println("Transactions");

                    //atunci se creaza o lista noua de tranzactii = ArrayList<Double> transactions
                    //si din elementul gasit se extrage lista de tranzactii facute
                    //adica se face apel la metoda getTransactions din clasa Customer
                    ArrayList<Double> transactions = branchCustomer.getTransactions();

                    //pentru fiecare tranzactie gasita in lista de tranzactii
                    for (int j = 0; j < transactions.size(); j++){

                        //se printeaza la ecran elementul din pozitia j =       transactions.get(j)
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

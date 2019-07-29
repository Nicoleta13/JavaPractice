package com.nicole;

import java.util.ArrayList;

public class MobilePhone {

    private String mynumber;
    private ArrayList<Contact> myContacts;

//CONSTRUCTOR
    public MobilePhone(String mynumber) {
        this.mynumber = mynumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    public boolean modifyPhoneContact(Contact currentContact, Contact newContact){
        int position = findContact(currentContact);
        if(position < 0) {
            System.out.println(currentContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                                " already exists. Update was not successful.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(currentContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removePhoneContact(Contact contact){
        int position = findContact(contact);
        if(position < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private int findContact(Contact searchContact){
        return myContacts.indexOf(searchContact);
    }

    private int findContact(String contactName) {
        for(int i =0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    //to return the data from another method
    //returns it as a string instead of an integer
    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact list:");
        for(int i =0; i<this.myContacts.size(); i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getNumber());
        }
    }
}

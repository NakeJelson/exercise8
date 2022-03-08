package com.company;

import java.util.ArrayList;


class CollectionMY {


    public static ArrayList<Contact> addContact(ArrayList<Contact> master) {
        Contact contact1 = new Contact("Joe Pesci", "joepesci@aol.com");
        Contact contact2 = new Contact("Bob", "bob@gmail.com");
        Contact contact3 = new Contact("John", "john123@gmail.com");
        BusinessContact bContact1 = new BusinessContact("Macaulay Culkin", "kevin.mccallister@hotmail.com", "555-554-3234");
        BusinessContact bContact2 = new BusinessContact("Kevin McAlister", "mculk@bing.com", "123-234-4567");
        master.add(contact1);
        master.add(contact2);
        master.add(contact3);
        master.add(bContact1);
        master.add(bContact2);
        return master;
    }

    public static void displayAllContacts(ArrayList<Contact> master) {

        for (Contact contact:master) {
            contact.display();
        }
    }
}

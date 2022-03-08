package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Contact> master = new ArrayList<Contact>();
    public static void main(String[] args) {
        CollectionMY.addContact(master);
        CollectionMY.displayAllContacts(master);
    }
}

//Jake Nelson 3-8-22 exercise8

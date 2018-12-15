package com.company;

public class Main {

    public static void main(String[] args) {

        Bank Misr = new Bank("Misr");
        Misr.addBranch("Giza");

	    Misr.addCustomer("Giza","Mohamed Ahmed",324);
        Misr.addCustomer("Giza","Yasser Ibrahim",543);
        Misr.addCustomer("Giza","Omar Mostafa",7657);
        Misr.addCustomer("Giza","Omar Mostafa",7655);

        Misr.listCustomers("Giza",false);

        //New Bank



    }
}

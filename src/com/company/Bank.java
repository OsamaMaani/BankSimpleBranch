package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {

        this.name = name;
        branches = new ArrayList<>();

    }

    public boolean addBranch(String branchName){
          if(findBranch(branchName)== null){
              this.branches.add(new Branch(branchName));
              return true ;
          }
        return  false;
    }

    public boolean addCustomer( String  branchName , String customerName, double amount){
           Branch branch = findBranch(branchName);
        if(findBranch(branchName)!= null){
            return  branch.newCustomer(customerName,amount);
        }
         return false;
    }

    public boolean addCustomerTransactions(String branchName,String cusName, double intitalAmount){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            branch.addCustomerTransactions(cusName,intitalAmount);
            return true;
        }

        return false;
    }

    public Branch findBranch(String branchName){

        for(int i = 0 ; i<branches.size();i++){

            if(branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return  null;
    }

    public boolean listCustomers(String  branchName, boolean showTransactions){

        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Details of branch : "+ branch.getName());
            ArrayList<Customer> customerArrrayList = branch.getCustomers();
            for(int i = 0 ; i<customerArrrayList.size();i++){
                System.out.println("Customer : " + customerArrrayList.get(i).getName() + "   Number : "+ "[" + (i+1)+ "]");
                Customer customer = customerArrrayList.get(i);
                if(showTransactions){
                    ArrayList<Double> doubleArrayList = customer.getTransactions();
                    for (int j = 0 ; j<doubleArrayList.size();j++){

                        System.out.println("Transaction No :  "+(j+1)+ "  = " + doubleArrayList.get(j));
                    }
                }
            }
       return true;
        }
        return  false ;
    }


}

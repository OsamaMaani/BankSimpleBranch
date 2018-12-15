     package com.company;

     import java.util.ArrayList;

     public class Branch {

     private  String name;
     private ArrayList<Customer>  customers;

     public Branch(String name) {
        this.name = name;
        customers  = new ArrayList<Customer>();
     }

         public ArrayList<Customer> getCustomers() {
             return customers;
         }

         public String getName() {
        return name;
     }

      public boolean newCustomer(String cusName, double amount){

        if(findCustomer(cusName) == null){
            this.customers.add(new Customer( cusName,amount));
             return true;
        }
          return false;
      }


      public boolean addCustomerTransactions(String cusName, double intitalAmount){
           Customer existingCus = findCustomer(cusName );
            if(existingCus !=null){
                existingCus.addTransactions(intitalAmount);
                return true;
            }

            return false;
      }

      private Customer findCustomer(String customerName){

         for(int i = 0 ; i< this.customers.size();i++){

             if(this.customers.get(i).getName().equals(customerName)){
                 return  this.customers.get(i);
             }
         }
         return  null;
      }
}

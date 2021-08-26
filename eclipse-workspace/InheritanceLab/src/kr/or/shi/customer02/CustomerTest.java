package kr.or.shi.customer02;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args){

        ArrayList<Customer> customerList = new ArrayList<>();       //상위타입 적용

        Customer customerT = new Customer(10010,"Jack");
        Customer customerJ = new Customer(10020,"James");
        Customer customerE = new Customer(10030,"Edward");
        Customer customerP = new Customer(10040,"Percy");
        Customer customerK = new Customer(10050,"Kim");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);
        
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        if(customerE instanceof VIPCustomer){
            VIPCustomer gc = (VIPCustomer)  customerE;
            System.out.println(gc.showCustomerInfo());
        }



    }
}

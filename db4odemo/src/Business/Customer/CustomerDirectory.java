/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private Customer customer;
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    public Customer getCustomer(String customerUsername) {
        for(Customer customer: customerList) {
            if(customer.getUsername().equalsIgnoreCase(customerUsername)) {
                return customer;
            }
        }
        return null;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name, String username, String password, String address, String number) {
        customer = new Customer(name, username, password, address, number);
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username) {
        for(int i=0; i<customerList.size(); i++) {
            if(customerList.get(i).getUsername() == username) {
                customerList.remove(i);
            }
        }
    }
    
    public void updateCustomer(Customer customer, String name, String username, String password, String address, String number) {
        for(Customer cust: customerList) {
            if(cust.getUsername().equalsIgnoreCase(username)) {
                customer.name = name;
                customer.username = username;
                customer.password = password;
                customer.address = address;
                customer.number = number;
            }
        }
    }
}

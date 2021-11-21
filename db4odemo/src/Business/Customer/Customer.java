/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Dishes;
import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    
    public String name;
    public String username;
    public String password;
    public String address;
    public String number;
    private ArrayList<Order> orderList;
    
    public Customer(String name, String username, String password, String address, String number) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.number = number;
        orderList = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    } 

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
        
    int id = 1;
      public void addOrder(String orderId, String restaurantName, String customerName, String delivermanName, String totalPrice, String status, ArrayList<Dishes> dishesList, String deliveryAddress) {
        Order order = new Order(orderId, restaurantName, customerName, delivermanName, totalPrice, status, dishesList, deliveryAddress);
        if(orderList == null) {
            orderList = new ArrayList<Order>();
        }
        orderList.add(order);
        id++;
    }

    @Override
    public String toString() {
        return name;
    }     
}

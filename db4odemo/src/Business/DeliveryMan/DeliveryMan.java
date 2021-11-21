/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Dishes;
import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    public String deliverymanName;
    public String deliverymanUsername;
    public String deliverymanPassword;
    public String deliverymanAddress;
    public String deliverymanNumber;
    public ArrayList<Order> orderList;
    int id = 1;
    
    public DeliveryMan(String deliverymanName, String deliverymanUsername, String deliverymanPassword, String deliverymanAddress, String deliverymanNumber) {
        this.deliverymanName = deliverymanName;
        this.deliverymanUsername = deliverymanUsername;
        this.deliverymanPassword = deliverymanPassword;
        this.deliverymanAddress = deliverymanAddress;
        this.deliverymanNumber = deliverymanNumber;
        orderList = new ArrayList<Order>();
    }

    public String getDeliverymanName() {
        return deliverymanName;
    }

    public void setDeliverymanName(String deliverymanName) {
        this.deliverymanName = deliverymanName;
    }

    public String getDeliverymanUsername() {
        return deliverymanUsername;
    }

    public void setDeliverymanUsername(String deliverymanUsername) {
        this.deliverymanUsername = deliverymanUsername;
    }

    public String getDeliverymanPassword() {
        return deliverymanPassword;
    }

    public void setDeliverymanPassword(String deliverymanPassword) {
        this.deliverymanPassword = deliverymanPassword;
    }

    public String getDeliverymanAddress() {
        return deliverymanAddress;
    }

    public void setDeliverymanAddress(String deliverymanAddress) {
        this.deliverymanAddress = deliverymanAddress;
    }

    public String getDeliverymanNumber() {
        return deliverymanNumber;
    }

    public void setDeliverymanNumber(String deliverymanNumber) {
        this.deliverymanNumber = deliverymanNumber;
    }

    public ArrayList<Order> getOrderList() {
        if(orderList == null) {
            orderList = new ArrayList<Order>();
        }
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
        
    public void addOrder(String orderId, String restaurantName, String customerName, String delivermanName, String totalPrice, String status, ArrayList<Dishes> dishesList, String deliveryAddress) {
        Order order = new Order(orderId, restaurantName, customerName, delivermanName, totalPrice, "New Order", dishesList, deliveryAddress);
        if(orderList == null) {
            orderList = new ArrayList<Order>();
        }
        orderList.add(order);
        id++;
    }

    @Override
    public String toString() {
        return deliverymanName;
    }
}

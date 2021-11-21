/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author dgoda
 */
public class Order {
    
    public String orderId;
    public String restaurantName;
    public String CustomerName;
    public String DeliveryName;
    public String totalPrice;
    public String status;
    public ArrayList<Dishes> OrderList;
    public String deliveryAddress;

    public Order(String orderId, String restaurantName, String CustomerName, String DeliveryName, String totalPrice, String status, ArrayList<Dishes> OrderList, String deliveryAddress) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.CustomerName = CustomerName;
        this.DeliveryName = DeliveryName;
        this.totalPrice = totalPrice;
        this.status = status;
        this.OrderList = OrderList;
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getDeliveryName() {
        return DeliveryName;
    }

    public void setDeliveryName(String DeliveryName) {
        this.DeliveryName = DeliveryName;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Dishes> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Dishes> OrderList) {
        this.OrderList = OrderList;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    @Override
    public String toString() {
        return orderId;
    }
}

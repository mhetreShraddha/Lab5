/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private Dishes menu;

    
    public RestaurantDirectory() {
        this.restaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public Restaurant getRestaurant(String restaurantUsername) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantUsername().equalsIgnoreCase(restaurantUsername)){
                            return restaurant;
            }
        }
        return null;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant createRestaurantUserAccount(String restaurantName, String restaurantUsername, String restaurantPassword, String restaurantAddress, String restaurantNumber) {
        restaurant = new Restaurant(restaurantName, restaurantUsername, restaurantPassword, restaurantAddress, restaurantNumber);
        restaurantList.add(restaurant);
        return restaurant;
    }

    public void deleteRestaurantInfo(String restaurantUsername) {
        for (int i = 0; i < restaurantList.size(); i++) {
            if (restaurantList.get(i).getRestaurantUsername() == restaurantUsername) {
                restaurantList.remove(i);
            }
        }
    }

    public void updateRestaurant(Restaurant restaurant, String restaurantName, String restaurantUsername, String restaurantPassword, String restaurantAddress, String restaurantNumber) {
        for (Restaurant rest : restaurantList) {
            if (rest.getRestaurantUsername().equalsIgnoreCase(restaurantUsername)) {
                restaurant.restaurantName = restaurantName;
                restaurant.restaurantUsername = restaurantUsername;
                restaurant.restaurantPassword = restaurantPassword;
                restaurant.restaurantAddress = restaurantAddress;
                restaurant.restaurantNumber = restaurantNumber;
            }
        }
    }

    public void updateRestaurantInfo(Restaurant restaurant, String restaurantName, String restaurantUsername, String restaurantAddress, String restaurantNumber) {
        for (Restaurant rest : restaurantList) {
            if (rest.getRestaurantUsername().equalsIgnoreCase(restaurantUsername)) {
                restaurant.restaurantName = restaurantName;
                restaurant.restaurantUsername = restaurantUsername;
                restaurant.restaurantAddress = restaurantAddress;
                restaurant.restaurantNumber = restaurantNumber;
            }
        }
    }
}

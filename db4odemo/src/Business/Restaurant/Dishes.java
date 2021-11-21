/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author dgoda
 */
public class Dishes {
    
    private String dishName;
    private String dishDescripton;
    private String price;
    
    public Dishes(String dishName, String dishDescription, String dishPrice) {
        this.dishName = dishName;
        this.dishDescripton = dishDescription;
        this.price = dishPrice;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishDescripton() {
        return dishDescripton;
    }

    public void setDishDescripton(String dishDescripton) {
        this.dishDescripton = dishDescripton;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return dishName;
    }
}
